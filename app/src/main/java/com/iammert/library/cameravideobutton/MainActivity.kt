package com.iammert.library.cameravideobutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.iammert.library.cameravideobuttonlib.CameraVideoButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoRecordButton = findViewById<CameraVideoButton>(R.id.button)
        videoRecordButton.setVideoDuration(1000)
        videoRecordButton.actionListener = object : CameraVideoButton.ActionListener{
            override fun onStartRecord() {
                Log.v("TEST", "onStartRecord")
            }

            override fun onEndRecord() {
                Log.v("TEST", "onEndRecord")
            }

            override fun onDurationTooShortError() {
                Log.v("TEST", "onDurationTooShortError")
            }

            override fun onSingleTap() {
                Log.v("TEST", "onSingleTap")
            }

        }
    }
}
