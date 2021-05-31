package com.example.uipractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity(),View.OnClickListener {


    private var buttonSignUp: Button? = null
    private var buttonlogin: Button? = null
    private var textViewTime: TextView? = null
    private var textViewDate: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSignUp = findViewById(R.id.sign_up)

        buttonlogin = findViewById(R.id.login)

        textViewDate = findViewById(R.id.view_date)
        textViewTime = findViewById(R.id.clock)

        setDateAndTime()
        buttonSignUp?.setOnClickListener{
            val signUpIntent = Intent(this, MainActivity2::class.java)
            startActivity(signUpIntent)
        }
        buttonlogin?.setOnClickListener{
            val logInIntent = Intent(this, MainActivity3::class.java)
            startActivity(logInIntent)
        }

    }
    private fun setDateAndTime(){
        val currentDate = Date()
     //   val timeFormat = simpleDateFormat("hh")
    }

    override fun onClick(v: View?) {
        Log.d("click", "Hello")
    }


    }
