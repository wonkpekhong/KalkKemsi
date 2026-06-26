package com.kalkkemsi.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDisplay = findViewById(R.id.tvDisplay)
    }

    fun onDigitClick(view: View) {
        if (view is Button) {
            if (tvDisplay.text == "0") {
                tvDisplay.text = view.text
            } else {
                tvDisplay.append(view.text)
            }
        }
    }
}
