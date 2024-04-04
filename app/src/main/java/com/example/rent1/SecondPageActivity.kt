package com.example.rent1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.rent1.R.*
import com.example.rent1.R.id.signUpLinkTextView

class SecondPageActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.second_page)

        // Sign Up linkine tıklama işlevselliğini ekle
        val signUpLinkTextView = findViewById<TextView>(R.id.signUpLinkTextView)
        signUpLinkTextView.setOnClickListener {
            val intent = Intent(this, ThirdPageActivity::class.java)
            startActivity(intent)
        }
    }
}
