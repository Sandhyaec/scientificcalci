package com.example.scientificcalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.lang.Math.log
import java.lang.Math.pow
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.tan

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val n1 : EditText = findViewById(R.id.editTextNumber1)
        val n2 : EditText = findViewById(R.id.editTextNumber2)
        val tot : EditText= findViewById(R.id.editTextNumber3)
        val b1 : Button=findViewById(R.id.button1)
        val b2 : Button=findViewById(R.id.button2)
        val b3 : Button=findViewById(R.id.button3)
        val b4 : Button=findViewById(R.id.button4)
        val b5 : Button=findViewById(R.id.button5)
        val b6 : Button=findViewById(R.id.button6)
        val b7 : Button=findViewById(R.id.button7)
        val b8 : Button=findViewById(R.id.button8)
        val b9 : Button=findViewById(R.id.button9)
        val b10 : Button=findViewById(R.id.button10)
        val b11 : Button=findViewById(R.id.button11)
        val b12 : Button=findViewById(R.id.button12)

        b1.setOnClickListener {
            val vl1 = n1.text.toString().toInt()
            val vl2 = n2.text.toString().toInt()

            val result = vl1+vl2
            tot.setText(result.toString())
        }
        b2.setOnClickListener {
            val vl1 = n1.text.toString().toInt()
            val vl2 = n2.text.toString().toInt()

            val result = vl1-vl2
            tot.setText(result.toString())
        }
        b3.setOnClickListener {
            val vl1 = n1.text.toString().toInt()
            val vl2 = n2.text.toString().toInt()

            val result = vl1*vl2
            tot.setText(result.toString())
        }
        b4.setOnClickListener {
            val vl1 = n1.text.toString().toInt()
            val vl2 = n2.text.toString().toInt()

            val result = vl1/vl2
            tot.setText(result.toString())
        }
        b6.setOnClickListener {
            val vl1 = n1.text.toString().toDouble()
            val result = sin(vl1)
            tot.setText(result.toString())
        }

        b7.setOnClickListener {
            val vl1 = n1.text.toString().toDouble()

            val result = cos(vl1)
            tot.setText(result.toString())
        }
        b8.setOnClickListener {
            val vl1 = n1.text.toString().toDouble()

            val result = tan(vl1)
            tot.setText(result.toString())
        }

        b9.setOnClickListener {
            val vl1 = n1.text.toString().toDouble()
            val result = sqrt(vl1)
            tot.setText(result.toString())
        }
        b10.setOnClickListener {
            val vl1 = n1.text.toString().toDouble()
            val vl2 = n2.text.toString().toDouble()
            val result = pow(vl1,vl2)
            tot.setText(result.toString())
        }
        b11.setOnClickListener {
            val vl1 = n1.text.toString().toDouble()
            val result = log(vl1)
            tot.setText(result.toString())
        }
        b12.setOnClickListener {
            val vl1 = n1.text.toString().toInt()
            val vl2 = n1.text.toString().toInt()
            val result = vl1%vl2
            tot.setText(result.toString())
        }
        b5.setOnClickListener {
            n1.setText("")
            n2.setText("")
            tot.setText("")
        }
    }
}