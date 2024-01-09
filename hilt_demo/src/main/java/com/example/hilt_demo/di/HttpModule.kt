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
import javax.inject.Singleton

/*
* di : 依赖注入
*
*
* */
@Module
@InstallIn(SingletonComponent::class)
class HttpModule {
    @Provides
    @Singleton // 单例
    fun provideAnalyticsService(retrofit: Retrofit): UserApi {
        return retrofit.create(UserApi::class.java)
    }

    @Provides
    @Singleton // 单例
    fun provideRetrofitService(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://10.161.9.80:9999/")
            .client(OkHttpClient().newBuilder().addInterceptor(
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            ).build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}