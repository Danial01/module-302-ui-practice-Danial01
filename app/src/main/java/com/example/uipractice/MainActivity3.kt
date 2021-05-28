package com.example.uipractice
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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

    }

    override fun onEditorAction(p0: TextView?, actionId: Int, p2: KeyEvent?): Boolean {
        return if (p0 == loginButton){
            val username = EditTextEmail?.text?.trim().toString()
            if (username.isEmpty() || (username.isBlank())) {

                EditTextEmail?.error = getString(R.string.username_cannot_be_empty)






}