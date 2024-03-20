package com.mab.buwisbuddyph

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Retrieve username from intent extras
        val email = intent.getStringExtra("EMAIL_KEY")
        val password = intent.getStringExtra("PASSWORD_KEY")

        // Display username
        val emailTextView = findViewById<TextView>(R.id.textView)
        emailTextView.text = "Email: $email"

        val passwordTextView = findViewById<TextView>(R.id.textView1) // Use textView1 for the password TextView
        passwordTextView.text = "Password: $password"

    }
}

