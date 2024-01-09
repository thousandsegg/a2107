package com.example.hilt_demo.di

import com.example.hilt_demo.service.UserApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
* di : 依赖注入
*
*
* */
@Module
@InstallIn(SingletonComponent::class)
class HttpModule {
    @Provides
    fun provideAnalyticsService(): UserApi {
        return Retrofit.Builder()
            .baseUrl("http://10.161.9.80:9999/")
            .client(OkHttpClient().newBuilder().addInterceptor(
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            ).build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UserApi::class.java)
    }
}