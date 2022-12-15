package com.example.buddynotespractiseapp.api

import com.example.buddynotespractiseapp.model.UserRequest
import com.example.buddynotespractiseapp.model.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface UserAPI {
    /**
    * This is endpoint where we are going to send the userRequest
    * In The post function we are going to send the userRequest in the body
    * @Body annotation defines a single request body
    * Retrofit offers the ability to pass objects within the request body.
    * Objects can be specified for use as HTTP request body by using the @Body annotation.
    * */
    @POST("/users/signup")
    suspend fun signup(@Body userRequest: UserRequest) : Response<UserResponse>

    @POST("/users/signin")
    suspend fun signin(@Body userRequest: UserRequest) : Response<UserResponse>
}