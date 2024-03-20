package com.mab.buwisbuddyph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_admission.*

class AdmissionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admission)

        buttonGetStarted.setOnClickListener {
            val intent = Intent(this, AdmissionOptActivity::class.java)
            startActivity(intent)
        }

    }
}


