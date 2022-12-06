package com.example.transferdataaudio

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var play=findViewById(R.id.button2) as Button
        var stop=findViewById(R.id.button3) as Button
        var mp=MediaPlayer()
        mp.setDataSource(this,Uri.parse("android.resource://"+this.packageName+"/"+R.raw.audio1))
        mp.prepare()
        mp.start()
        play.setOnClickListener{}

    }
}