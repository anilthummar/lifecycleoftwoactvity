package com.example.activityatobactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton

class MainActivity  : AppCompatActivity() {

    /* Result

     // When user is on Activity B

    Activity A -> onCreate()
    Activity A -> onStart()
    Activity A -> onResume()

     // User Click on Button and move to another activity
    Activity A -> onPause()

    Activity B -> onCreate()
    Activity B -> onStart()
    Activity B -> onResume()

    Activity A -> onStop()

     // From Activity B User Click on back button and move to another activity A
    Activity B -> onPause()

    Activity A -> onRestart()
    Activity A -> onStart()
    Activity A -> onResume()

    Activity B -> onStop()
    Activity B -> onDestroy()


     // When user click on back press from Actvity A
    Activity A -> onPause()
    Activity A -> onStop()
    Activity A -> onDestroy()

    */


    lateinit var btnMoveB : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogM.LogI("MainActivity__  onCreate:")

        btnMoveB=findViewById(R.id.btnB)


        btnMoveB.setOnClickListener {

//            val mIntent : Intent = Intent(this, ScondActivity::class.java)
            startActivity(Intent(this, ScondActivity::class.java))

        }


    }

    override fun onStart() {
        super.onStart()
        LogM.LogI("MainActivity__  onStart:")
    }

    override fun onResume() {
        super.onResume()
        LogM.LogI("MainActivity__  onResume:")
    }



    override fun onPause() {
        super.onPause()

        LogM.LogI("MainActivity__  onPause:")
    }

    override fun onRestart() {
        super.onRestart()
        LogM.LogI("MainActivity__  onRestart:")
    }

    override fun onStop() {
        super.onStop()
        LogM.LogI("MainActivity__  onStop:")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogM.LogI("MainActivity__  onDestroy:")
    }

}