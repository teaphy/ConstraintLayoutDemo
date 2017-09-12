package com.teaphy.constraintlayoutdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun setListener() {
        btnGoneMargin.setOnClickListener{
            val intent = Intent(this@MainActivity, GoneMarginActivity::class.java)
            startActivity(intent)
        }
    }
}
