package com.francisgonzales.androidactivitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var lifecycleTextView: TextView
    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleTextView = findViewById(R.id.lifecycleTextView)
        btn = findViewById(R.id.btnClick)
        logAndDisplay("onCreate")

        btn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        logAndDisplay("onStart")
    }

    override fun onResume() {
        super.onResume()
        logAndDisplay("onResume")
    }

    override fun onPause() {
        super.onPause()
        logAndDisplay("onPause")
    }

    override fun onStop() {
        super.onStop()
        logAndDisplay("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        logAndDisplay("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        logAndDisplay("onDestroy")
    }

    private fun logAndDisplay(event: String) {
        val message = "Lifecycle Event: $event"
        Log.d("ActivityLifecycleDemo", message)
        lifecycleTextView.append("\n$message")
    }
}
