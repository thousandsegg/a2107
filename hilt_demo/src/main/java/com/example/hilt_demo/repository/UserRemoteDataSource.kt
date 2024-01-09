package com.example.hilt_demo.repository

import android.util.Log
import com.example.hilt_demo.service.UserApi
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(val userApi: UserApi) {
    suspend fun getBannerInfo(){
        val bannerInfo = userApi.getBannerInfo(0,1,5)
        Log.i("===",bannerInfo.msg)
    }
}