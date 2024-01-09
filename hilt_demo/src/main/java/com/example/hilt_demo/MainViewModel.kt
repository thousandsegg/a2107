package com.example.hilt_demo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hilt_demo.repository.UserLocalDataSource
import com.example.hilt_demo.repository.UserRemoteDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val userLocalDataSource: UserLocalDataSource,
    val userRemoteDataSource: UserRemoteDataSource
) : ViewModel() {
     fun test01(){
        //创建携程作用域
        viewModelScope.launch {
            userLocalDataSource.run { userRemoteDataSource.getBannerInfo() }
        }
    }
}