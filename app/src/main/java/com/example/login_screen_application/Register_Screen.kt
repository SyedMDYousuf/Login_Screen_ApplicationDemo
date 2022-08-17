package com.example.login_screen_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class Register_Screen : AppCompatActivity() {

//    lateinit var signinbtn : MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)

        val signinbtn = findViewById<MaterialButton>(R.id.signupbtn)
        signinbtn.setOnClickListener{
            uiValidation()
        }
        redirectToLogin()


    }

    fun uiValidation() {

        var name = findViewById<TextInputEditText>(R.id.nameEt)
        var email = findViewById<TextInputEditText>(R.id.emailEt)
        var password = findViewById<TextInputEditText>(R.id.passET)
        var confirmpassword = findViewById<TextInputEditText>(R.id.confirmPassEt)

        if (name.text.toString().isEmpty()) {
            Toast.makeText(applicationContext, "Enter the Name", Toast.LENGTH_SHORT).show()
        }else if (email.text.toString().isEmpty()){

            Toast.makeText(applicationContext, "Enter Email", Toast.LENGTH_SHORT).show()

        }else if (password.text.toString().isEmpty()){
            Toast.makeText(applicationContext, "Enter Password", Toast.LENGTH_SHORT).show()
        }else if(confirmpassword.text.toString().isEmpty()){
            Toast.makeText(applicationContext, "ReEnter the Password", Toast.LENGTH_SHORT).show()
        }else{
            val intent = Intent(this,SignIn_Screen::class.java)
            startActivity(intent)
        }

    }

    fun redirectToLogin() {
        val tvSignIn = findViewById<MaterialTextView>(R.id.signin_textView)
        tvSignIn.setOnClickListener {
            val intent = Intent(this, SignIn_Screen::class.java)
            startActivity(intent)
        }
    }


}