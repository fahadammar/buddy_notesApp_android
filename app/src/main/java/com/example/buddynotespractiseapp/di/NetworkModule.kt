package com.example.buddynotespractiseapp.di

import com.example.buddynotespractiseapp.api.UserAPI
import com.example.buddynotespractiseapp.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit_Instance() : Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }

    @Singleton
    @Provides
    fun provideUserAPI_Instance(retrofit: Retrofit) : UserAPI {
        return retrofit.create(UserAPI::class.java)
    }

}

/***
 * All the application level objects we defines them in the SingletonComponent
 * Singleton simply means in all over the application the single object will be used
 */