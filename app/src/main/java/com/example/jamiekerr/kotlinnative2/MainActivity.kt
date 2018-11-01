package com.example.jamiekerr.kotlinnative2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import sample.Filter
import sample.Platform

class MainActivity : AppCompatActivity() {

    private val filter = Filter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val list = listOf("Monkey", "Tarantula", "Software", "Frijj","Cat", "Hi", "Pi")
        val filtered = filter.filterLength(list, 5)
        setContentView(R.layout.activity_main)
        val text = "Result is $filtered"
        findViewById<TextView>(R.id.lbl).text = text

        Toast.makeText(this, "Kotlin Native On ${Platform.name()}", Toast.LENGTH_LONG).show()
    }
}
