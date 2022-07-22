package com.example.newkalkuliator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newkalkuliator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var oldText: String
    var firstNumber = 0
    var secondNumber = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        nuberBtn()
        clearBtn()
        mathOperations()

    }

    private fun mathOperations() {
        binding.apply {
            add.setOnClickListener {
                oldText+="+"
                mainText.setText(oldText)
            }
            minus.setOnClickListener {
                oldText+="-"
            }
            tobe.setOnClickListener {
                oldText+="/"
            }
            increase.setOnClickListener {
                oldText+="*"
            }
            percent.setOnClickListener {
                oldText+="%"
            }
        }
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
            dot.setOnClickListener {
                numberWrite(".")
            }
        }
    }
    private fun numberWrite(number:String){
        oldText = binding.mainText.text.toString()
        if (oldText=="0" && number!=".")
            oldText = number
        else
            oldText+=number
        binding.mainText.setText(oldText)
    }
}