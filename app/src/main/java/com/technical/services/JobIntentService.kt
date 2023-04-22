package com.technical.services
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class JobIntentService : JobIntentService() {
    override fun onHandleWork(intent: Intent) {
        Log.d("Service","Job Inent Service is started")
        Log.d("Service Thread",Thread.currentThread().name)
    }
    fun myBackgroundService(context:Context,intent:Intent)
    {
        enqueueWork(context,JobIntentService::class.java,1,intent)
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("Service","Job Intent Service is stopped")
    }
}