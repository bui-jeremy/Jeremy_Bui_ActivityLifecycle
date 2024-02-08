package com.bignerdranch.android.jeremybui_activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloButton: Button = findViewById(R.id.btnHello)
        val helloTV: TextView = findViewById(R.id.TVHello)
        val helloET: EditText = findViewById(R.id.ETVHello)

        helloButton.setOnClickListener{
            helloTV.text = "Hello"
            helloET.setText("Hello")
        }
        Log.d("ActivityLifecycle", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityLifecycle", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifecycle", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityLifecycle", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityLifecycle", "onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityLifecycle", "onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityLifecycle", "onDestroy called")
    }
}