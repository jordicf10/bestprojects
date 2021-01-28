package com.example.pacdesarrollo


import android.app.Service
import android.content.Intent
import android.content.Intent.getIntent
import android.media.MediaPlayer
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.view.View
import android.widget.Button
import android.widget.Toast


class ServMusic : Service(), MediaPlayer.OnPreparedListener {


    lateinit var reproductor: MediaPlayer

    private val binder = LocalBinder()

    inner class LocalBinder : Binder(){
        fun getService():ServMusic=this@ServMusic
    }

    override fun onBind(intent: Intent): IBinder? {
        Toast.makeText(this,"Servicio ON", Toast.LENGTH_SHORT).show()
        reproductor= MediaPlayer.create(this,R.raw.iris)
        reproductor.isLooping=true
        if(!reproductor.isPlaying){
            reproductor.start()
        }
        //return super.onStartCommand(intent, flags, startId)
        return binder

    }






    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        //Toast.makeText(this,"Servicio ON", Toast.LENGTH_SHORT).show()
        /*reproductor= MediaPlayer.create(this,R.raw.iris)
        reproductor.isLooping=true
        if(!reproductor.isPlaying){
           reproductor.start()
        }*/
       return super.onStartCommand(intent, flags, startId)
    }



    override fun onDestroy() {
        Toast.makeText(this,"Servicio OFF", Toast.LENGTH_SHORT).show()
        if(reproductor.isPlaying){

            reproductor.release()
            stopSelf()
        }




    }


    override fun onPrepared(mp: MediaPlayer?) {
        TODO("Not yet implemented")
    }
}



