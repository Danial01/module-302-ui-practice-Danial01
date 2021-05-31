package com.example.uipractice
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*



class MainActivity2: AppCompatActivity(), View.OnClickListener {

    private var EditTextName: EditText? = null
    private var EditTextEmail: EditText? = null
    private var EditTextPassword: EditText? = null
    private var CreateAccountButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        EditTextName = findViewById(R.id.EditTextName)
        EditTextEmail = findViewById(R.id.EditTextEmail)
        EditTextPassword = findViewById(R.id.EditTextPassword)
        CreateAccountButton = findViewById(R.id.ButtonCreateAccount)


    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}