package com.example.myapplicationhttpcalls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val Aboutbn1 =findViewById<Button>( R.id.about_btn1)
        Aboutbn1.setOnClickListener {
//            intentanilize intent

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}