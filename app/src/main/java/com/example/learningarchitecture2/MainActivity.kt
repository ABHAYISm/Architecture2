package com.example.learningarchitecture2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.learningarchitecture2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainviewModel: MainviewModel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainviewModel=ViewModelProvider(this).get(MainviewModel::class.java)
        mainviewModel.quoteLiveData.observe(this, Observer{
            binding.Quote.text=it
        })
        //making its lifecycleowner
        binding.lifecycleOwner=this
        binding.newmainviewModel=mainviewModel
//        binding.btnUpdate.setOnClickListener{
//            mainviewModel.UpdateQuote()
//        }

//        val quoteObj=Quote("Dont die in IIT","~Abhay")
//        binding.quote = quoteObj
    }
}