package com.example.mvvmproject

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HTTP
import retrofit2.http.POST

interface UserApi {
   // @HTTP(method = "GET", path = "/login", hasBody = true)
    @GET("/login?")
   // @POST("/api/authaccount/login")
    suspend fun loginUser(@Body loginRequest: LoginRequest): Response<LoginResponse>
    //suspend fun loginUser(@Body loginRequest: LoginRequest): Response<LoginResponse>

    companion object {
        fun getApi(): UserApi? {
            return ApiClient.client?.create(UserApi::class.java)
        }
    }
}