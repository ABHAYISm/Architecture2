package com.example.learningarchitecture2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainviewModel :ViewModel() {
    val quoteLiveData =MutableLiveData("What you give is what to you take")
    fun UpdateQuote(){
        quoteLiveData.value="You'll see it when you believe it"
    }
}