package com.stogo.firstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val connect = findViewById<Button>(R.id.connect)
        val email   = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val error = findViewById<TextView>(R.id.error)
        connect.setOnClickListener {
             error.visibility = View.GONE
             val txtEmail = email.text.toString()
             val txtPassword = password.text.toString()
            if(txtEmail.trim().isEmpty() || txtPassword.trim().isEmpty()) {
                error.text ="vous devez remplir tout les champs !"
                error.visibility = View.VISIBLE
            }  else{
                val correctEmail = "nourdine@gmail.com"
                val correctPassword = "nourdine1234"
                if(correctEmail == txtEmail && correctPassword == txtPassword){
                    email.setText("")
                    password.setText("")
                    val intentHomeActivity = Intent( this, HomeActivity::class.java)
                    intentHomeActivity.putExtra("email",txtEmail)
                    startActivity(intentHomeActivity)
                } else{
                    error.text ="Email ou password n'est pas correct"
                    error.visibility = View.VISIBLE
                }
            }

        }
    }
}


