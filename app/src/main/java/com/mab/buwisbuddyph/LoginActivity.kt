package com.mab.buwisbuddyph

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        SignInButton.setOnClickListener {
            val email = editTextEmail.text.toString()
            val intent = Intent(this, DashboardActivity::class.java)
            intent.putExtra("EMAIL_KEY", email)
            startActivity(intent)
        }
    }
}