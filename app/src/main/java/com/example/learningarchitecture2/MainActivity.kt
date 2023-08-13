package com.example.learningarchitecture2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.learningarchitecture2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val quoteObj=Quote("Dont die in IIT","~Abhay")
        binding.quote = quoteObj
//        binding.Author.txt="~Abhay"
//        binding.Quote.text="dont die in IIT"
    }
}