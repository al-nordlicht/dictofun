package com.esrlabs.dictofun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class IntroductionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction)
    }

    fun goToDeviceConnectionActivity(view: View) {
        val intent = Intent(this, DeviceConnectionActivity::class.java)
        startActivity(intent)
    }
}