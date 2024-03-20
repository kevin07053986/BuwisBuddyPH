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

        // Display username
        val emailTextView = findViewById<TextView>(R.id.textView)
        emailTextView.text = "Welcome, $email"

    }
}

