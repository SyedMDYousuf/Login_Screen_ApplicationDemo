package com.example.login_screen_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textview.MaterialTextView

class SignIn_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin_screen)


        val tvSignUp = findViewById<MaterialTextView>(R.id.signup_textView)
        tvSignUp.setOnClickListener {
            val intent = Intent(this, Register_Screen::class.java)
            startActivity(intent)
        }
    }


}


