package com.manishdubey.assigment

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)
        val btn1=findViewById<TextView>(R.id.androidDev)
        val btn2=findViewById<TextView>(R.id.leetCode)
        val btn3=findViewById<TextView>(R.id.iosApp)
        val btn4=findViewById<TextView>(R.id.machineLearning)
        val btn5=findViewById<TextView>(R.id.codechef)
        val btn6=findViewById<TextView>(R.id.hackerRank)
        btn1.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.android.com/kotlin")
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://leetcode.com")
            startActivity(intent)
        }
        btn3.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.coursera.org/specializations/app-development")
            startActivity(intent)
        }
        btn4.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developers.google.com/machine-learning/crash-course")
            startActivity(intent)
        }
        btn5.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://codechef.com")
            startActivity(intent)
        }
        btn6.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://hackerrank.com")
            startActivity(intent)
        }
        val back=findViewById<Button>(R.id.btnBack)
        back.setOnClickListener{
            intent=Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
        val next=findViewById<Button>(R.id.btnNext)
        next.setOnClickListener{
            intent=Intent(applicationContext,ThirdPage::class.java)
            startActivity(intent)
        }
    }
}