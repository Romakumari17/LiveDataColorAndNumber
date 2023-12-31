package com.romakumari.livedatacolorandnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.romakumari.livedatacolorandnumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var livedata: ViewModel
    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        livedata=ViewModelProvider(this)[ViewModel::class.java]
        binding.btnpurple.setOnClickListener {
            livedata.color.value=1
        }
        binding.btnpink.setOnClickListener {
            livedata.color.value=2
        }
        binding.btngreen.setOnClickListener {
            livedata.color.value=3
        }
        binding.btnAdd.setOnClickListener {
            number++
            binding.tvtext.setText(number.toString())
            livedata.number.value=number
        }
        binding.btnminus.setOnClickListener {
            number--
            livedata.number.value=number
            binding.tvtext.setText(number.toString())
        }

      livedata.reset.observe(this){
          binding.tvtext.setText(it.toString())
      }

    }
}