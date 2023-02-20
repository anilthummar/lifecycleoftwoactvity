package com.example.activityatobactivity

import android.util.Log

object LogM {

    @JvmStatic
    var development: Boolean = true

    @JvmStatic
    fun LogV(Message: String) {
        if(development){
            Log.v("LogV : ", Message)
        }
    }

    @JvmStatic
    fun LogI(Message: String) {
        if(development) {
            Log.i("LogI : ", Message)
        }
    }
    @JvmStatic
    fun LogE(tag: String, msg: String, response: String) {
        if(development) {
            Log.e(tag, msg + response)
        }
    }

    @JvmStatic
    fun LogError(callLoginAPI: String, message: String) {
        if(development) {
            Log.e(callLoginAPI, message);
        }
    }


}