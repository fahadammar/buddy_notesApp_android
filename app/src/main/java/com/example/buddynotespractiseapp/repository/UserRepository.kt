package com.example.buddynotespractiseapp.repository

import android.util.Log
import com.example.buddynotespractiseapp.api.UserAPI
import com.example.buddynotespractiseapp.model.UserRequest
import com.example.buddynotespractiseapp.utils.Constants.TAG
import javax.inject.Inject

class UserRepository @Inject constructor(private val userAPI : UserAPI) {

    suspend fun registerUser (userRequest: UserRequest){
        val response = userAPI.signup(userRequest)
        logResponse(response.body().toString(), "Register User")
    }

    suspend fun loginUser (userRequest: UserRequest){
        val response = userAPI.signin(userRequest)
        logResponse(response.body().toString(), "Login User")
    }

    private fun logResponse(response: String, calledAt : String) {
        Log.d(TAG, "$calledAt: $response")
    }

}