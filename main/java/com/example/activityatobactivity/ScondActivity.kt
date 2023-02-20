package com.example.activityatobactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton

class ScondActivity  : AppCompatActivity() {

    lateinit var btnMoveB : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogM.LogI("MainActivity__  S onCreate:")
        


    }

    override fun onStart() {
        super.onStart()
        LogM.LogI("MainActivity__  S  onStart:")
    }

    override fun onResume() {
        super.onResume()
        LogM.LogI("MainActivity__  S  onResume:")
    }



    override fun onPause() {
        super.onPause()

        LogM.LogI("MainActivity__  S  onPause:")
    }

    override fun onRestart() {
        super.onRestart()
        LogM.LogI("MainActivity__  S  onRestart:")
    }

    override fun onStop() {
        super.onStop()
        LogM.LogI("MainActivity__  S  onStop:")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogM.LogI("MainActivity__  S  onDestroy:")
    }

}