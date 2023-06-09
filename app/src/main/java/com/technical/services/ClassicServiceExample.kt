package com.technical.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ClassicServiceExample:Service() {
    override fun onBind(p0: Intent?): IBinder? {
       return null
    }

    override fun onCreate() {
        super.onCreate()

        Log.d("Service","Classic Service is created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("Service","Classic Service is started")
        Log.d("Service Thread",Thread.currentThread().name)

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("Service","Classic Service is stopped")
    }
}