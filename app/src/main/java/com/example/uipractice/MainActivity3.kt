package com.example.uipractice
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity3: AppCompatActivity() {

    private var EditTextEmail: EditText? = null
    private var EditTextPassword: EditText? = null
    private var loginButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        EditTextEmail = findViewById(R.id.EditTextEmail)
        EditTextPassword = findViewById(R.id.EditTextPassword)
        loginButton = findViewById(R.id.ButtonCreateAccount)

        EditTextEmail?.setOnClickListener{
            val signUpIntent = Intent(this, MainActivity2::class.java)
            startActivity(signUpIntent)

    }

        val username = EditTextEmail?.text?.trim().toString()
    if(username.isEmpty() || username.isBlank()) {
        Toast.makeText(applicationContext, "Message : "+ "Please enter your email!", Toast.LENGTH_SHORT).show()
    } else {
        Toast.makeText(applicationContext, "Email cannot be empty", Toast.LENGTH_SHORT).show()
    }
}




}