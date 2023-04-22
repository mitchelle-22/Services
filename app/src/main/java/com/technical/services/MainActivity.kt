package com.technical.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var startClassicService : Button
    lateinit var startJobInentService : Button
    lateinit var stopService : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startClassicService = findViewById(R.id.stratClassicService)
        startJobInentService = findViewById(R.id.startJobIntentService)
        stopService = findViewById(R.id.stratClassicService)

        startClassicService.setOnClickListener{

            val intent = Intent(this@MainActivity,ClassicServiceExample::class.java)
            startService(intent)
        }

        startJobInentService.setOnClickListener{
             val intent = Intent(this@MainActivity,JobIntentService::class.java)
            JobIntentService.myBackgroundSerice(this@MainActivity,intent)
        }

        stopService.setOnClickListener {

        }
    }
}