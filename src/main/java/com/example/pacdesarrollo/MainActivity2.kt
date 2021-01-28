package com.example.pacdesarrollo

import android.content.ContentValues
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity(){


    var btnGuardar: Button? = null
    var btnBuscar: Button? = null
    var btnActualizar: Button? = null
    var btnBorrar: Button? = null
    var etId: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    

    
    Toast.makeText(this, "Activity 2", Toast.LENGTH_SHORT).show()

    var vueltados = findViewById<Button>(R.id.vuelta2)

    vueltados.setOnClickListener {
        var volverdos = Intent(this, MainActivity::class.java)
        startActivity(volverdos)
    }


    //var conn: AdminBBDD = AdminBBDD(this, "bd_peliculas", null, 1)
    var btn_tabla = findViewById<Button>(R.id.tabla)
    var btn_inserta = findViewById<Button>(R.id.insertar)
    var btn_consulta = findViewById<Button>(R.id.consultar)

        btn_tabla.setOnClickListener {
            val boss = AdminBBDD(this, "Peliculas", null, 1)
            val bbdd = boss.writableDatabase
            Toast.makeText(this, "Tabla Peliculas creada", Toast.LENGTH_SHORT).show()

        }


        btn_inserta.setOnClickListener {
            val actividaddosdos = Intent(this, MainActivity22::class.java)
            startActivity(actividaddosdos)
        }

        var btnpelicula= findViewById<EditText>(R.id.bpelicula)
        var btnvaloracion = findViewById<EditText>(R.id.bvaloracion)
        var btnfechaestreno = findViewById<EditText>(R.id.bestreno)
    
    
    btn_consulta.setOnClickListener {
        val actividaddosdos = Intent(this, MainActivity22::class.java)
        startActivity(actividaddosdos)


        }

    }
}

