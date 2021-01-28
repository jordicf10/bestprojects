package com.example.pacdesarrollo

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main22)

        var id: Int = 0
        var nombre: String = ""
        var valoracion: Int = 0
        var fechaestreno: Int = 0
        var btnpelicula = findViewById<EditText>(R.id.bpelicula)
        var btnvaloracion = findViewById<EditText>(R.id.bvaloracion)
        var btnfechaestreno = findViewById<EditText>(R.id.bestreno)
        var btnGuardar = findViewById<Button>(R.id.guardar)
        var btnConsulta = findViewById<Button>(R.id.btnconsultar)
        var lista: MutableList<Pelis> = ArrayList()
        var listaPelis: MutableList<Pelis> = ArrayList()


        fun insertapelis() {
            lista.add(Pelis(0, nombre, valoracion.toInt(), fechaestreno.toInt()))
            btnpelicula!!.setText("")
            btnvaloracion!!.setText("")
            btnfechaestreno!!.setText("")


        }


        btnGuardar.setOnClickListener {
            insertapelis()
            Toast.makeText(applicationContext, "Película insertada: ", Toast.LENGTH_LONG).show()
        }


        btnConsulta.setOnClickListener {
            val admin = AdminBBDD(this,"DATABASE_NAME", null, 1)
            val bd = admin.readableDatabase

            val selecpelis = arrayOf(AdminBBDD.TablaData.PELICULASCOL.toString())
            val busqueda = arrayOf<String>(AdminBBDD.TablaData.PELICULASCOL, AdminBBDD.TablaData.VALORACIONCOL, AdminBBDD.TablaData.ESTRENOCOL)
            val consulta = bd.query(AdminBBDD.TablaData.NTABLA, busqueda, AdminBBDD.TablaData.IDCOLUMNA.toString() + "=?", selecpelis, null, null, null)
            consulta.moveToFirst()
            btnpelicula!!.setText(consulta.getString(0))
            btnvaloracion!!.setText(consulta.getString(1))
            btnfechaestreno!!.setText(consulta.getString(2))


        }


    }


}