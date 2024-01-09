package com.example.hilt_demo

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel


class MainViewModel : ViewModel() {
    fun test01(){
        println("test01")
    }
}