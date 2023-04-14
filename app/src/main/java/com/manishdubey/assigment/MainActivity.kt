package com.manishdubey.assigment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewInt=findViewById<TextView>(R.id.letsGo)
        viewInt.setOnClickListener{
            intent=Intent(applicationContext,SecondPage::class.java)
            startActivity(intent)
        }
    }
}