package com.example.newkalkuliator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newkalkuliator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var oldText: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        nuberBtn()
        clearBtn()

    }
    private fun clearBtn() {
        binding.apply {
            clearBtn.setOnClickListener {
            this.mainText.text="0"
            }
        }

    }

    private fun nuberBtn() {
        binding.apply {
            firstNuber.setOnClickListener {
                numberWrite("1")
            }
            secondNumber.setOnClickListener {
                numberWrite("2")
            }
            threeNumber.setOnClickListener {
                numberWrite("3")
            }
            fourNumber.setOnClickListener {
                numberWrite("4")
            }
            fiveNumber.setOnClickListener {
                numberWrite("5")
            }
            sixNubmer.setOnClickListener {
                numberWrite("6")
            }
            sevenNumber.setOnClickListener {
                numberWrite("7")
            }
            eightNumber.setOnClickListener {
                numberWrite("8")
            }
            nineNumber.setOnClickListener {
                numberWrite("9")
            }
            zeroNumber.setOnClickListener {
                numberWrite("0")
            }
        }
    }
    private fun numberWrite(number:String){
        oldText = binding.mainText.text.toString()
        if (oldText=="0")
            oldText = number
        else
            oldText+=number
        binding.mainText.setText(oldText)
    }
}