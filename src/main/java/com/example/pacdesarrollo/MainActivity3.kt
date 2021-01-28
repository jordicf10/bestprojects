package com.example.pacdesarrollo

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.media.MediaPlayer
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.IBinder
import android.widget.Button
import android.widget.Toast


class MainActivity3 : AppCompatActivity() {

    //lateinit var servicioIntent: Intent

    private lateinit var reproductor: MediaPlayer

    lateinit var botonplay: Button
    lateinit var botonstop: Button
    lateinit var botonsleep: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var vueltatres = findViewById<Button>(R.id.vuelta3)
        vueltatres.setOnClickListener {
            var volvertres = Intent(this, MainActivity::class.java)
            startActivity(volvertres)
        }

        var btn_arranca: Button
        btn_arranca = findViewById(R.id.arranca)

        var btn_para: Button
        btn_para = findViewById(R.id.para)

        var botonplay: Button = findViewById(R.id.play)
        var botonstop: Button = findViewById(R.id.stop)
        var botonsleep: Button = findViewById(R.id.sleep)

        var reproduciendo: Boolean = false;
        var detenido: Boolean = false;



         lateinit var myService: ServMusic
         var mBound: Boolean = false
         val conexion = object : ServiceConnection {

            override fun onServiceConnected(className: ComponentName, service: IBinder) {

                val binder = service as ServMusic.LocalBinder
                myService = binder.getService()
                mBound = true

            }



            override fun onServiceDisconnected(arg0: ComponentName) {
                mBound = false

            }
        }








        botonplay.setOnClickListener {
            if (reproduciendo) {
                reproductor = MediaPlayer.create(this, R.raw.iris)
                reproductor.start()

            }
            reproduciendo = !reproduciendo

        }

        botonstop.setOnClickListener {
            if (!detenido) {
                reproductor.stop()
                reproductor.prepare()
                reproductor.seekTo(0)

            }
            detenido = !detenido
        }





        botonsleep.setOnClickListener {
            reproductor.pause()
            Handler().postDelayed(Runnable {

                reproductor.start()

            }, 15000)
        }


        btn_arranca.setOnClickListener {
            startService(Intent(this, ServMusic::class.java))
            Toast.makeText(this, "Servicio creado", Toast.LENGTH_SHORT).show()
            Intent(this, ServMusic::class.java).also { intent ->
                bindService(intent, conexion, Context.BIND_AUTO_CREATE)
            }

        }

        btn_para.setOnClickListener {
            stopService(Intent(this, ServMusic::class.java))
            Toast.makeText(this, "Servicio detenido", Toast.LENGTH_SHORT).show()

        }

    }



}







