package com.mab.buwisbuddyph

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        SignInButton.setOnClickListener {
            val email = editTextEmail.text.toString()
            if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                // Display an error message
                Toast.makeText(this, "Invalid email address", Toast.LENGTH_SHORT).show()
                return@setOnClickListener // Exit the function if the email is invalid
            }
            val password = editTextPassword.text.toString()
            if (password.isEmpty()) {
                Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener // Exit the function if the password is empty
            }


            val intent = Intent(this, DashboardActivity::class.java)
            intent.putExtra("EMAIL_KEY", email)
            intent.putExtra("PASSWORD_KEY", password)
            startActivity(intent)
        }
    }
}