package com.example.gitproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intent  = Intent(Intent.ACTION_VIEW)
        intent.setData(Uri.parse("http://www.javatpoint.com"))
        startActivity(intent)
        var btn : Button = findViewById(R.id.btn1)
        btn.setOnClickListener {
            Toast.makeText(applicationContext, "Hello to Android", Toast.LENGTH_LONG).show()

        }
    }
}