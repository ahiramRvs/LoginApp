package com.example.loginapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// valores contra los que se comprueba el login
private const val EMAIL_CORRECTO = "ahiramrivasillanes@gmail.com"
private const val PASSWORD_CORRECTO = "1234"

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enlazamos las vistas del xml con las variables del kotlin
        val Email = findViewById<EditText>(R.id.email)
        val Password = findViewById<EditText>(R.id.password)
        val btnSignUp = findViewById<Button>(R.id.btnSignUp)

        // accion realizada al pulsar el botón
        btnSignUp.setOnClickListener {
            val email = Email.text.toString().trim()
            val password = Password.text.toString()

            if (email == EMAIL_CORRECTO && password == PASSWORD_CORRECTO) {
                Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ko", Toast.LENGTH_SHORT).show()
            }
        }
    }
}