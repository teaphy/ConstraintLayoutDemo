package com.teaphy.constraintlayoutdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_gone_margin.*

class GoneMarginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gone_margin)

        setListener()
    }

    private fun setListener() {
        btnVisible.setOnClickListener{
            btnGoneA.visibility = View.VISIBLE
        }

        btnGone.setOnClickListener {
            btnGoneA.visibility = View.GONE
        }
    }
}
