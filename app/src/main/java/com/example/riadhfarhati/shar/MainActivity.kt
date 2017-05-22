package com.example.riadhfarhati.shar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b = findViewById(R.id.button) as Button
       val e = findViewById(R.id.editText) as EditText
        b.setOnClickListener {
            var text = e.text.toString()
            val sharingIntent = Intent(android.content.Intent.ACTION_SEND)

            sharingIntent.type = "text/plain"
            sharingIntent.putExtra(Intent.EXTRA_TEXT, text)
            
            val chosser = Intent.createChooser(sharingIntent, "shar")


            startActivity(chosser)
        }
    }
}
