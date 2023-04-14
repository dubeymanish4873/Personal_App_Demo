package com.manishdubey.assigment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class ThirdPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)
        val q=findViewById<CardView>(R.id.cardview)
        q.setOnClickListener{
            val intent= Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:"+"9934214745")
            startActivity(intent)
        }
        val prev=findViewById<Button>(R.id.btnPrev)
        prev.setOnClickListener{
            intent=Intent(applicationContext,SecondPage::class.java)
            startActivity(intent)
        }
    }
}