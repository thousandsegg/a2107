package com.example.hilt_demo.service

import com.example.hilt_demo.User
import com.example.hilt_demo.bean.BannerBean
import retrofit2.http.GET
import retrofit2.http.Query

interface UserApi {
    @GET("/banner/select")
    suspend fun getBannerInfo(@Query("type") type: Int,@Query("page") page: Int,@Query("pageSize") pageSize: Int) : BannerBean
}