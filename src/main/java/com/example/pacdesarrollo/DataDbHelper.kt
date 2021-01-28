package com.example.pacdesarrollo

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.pacdesarrollo.AdminBBDD.Companion.DATABASE_NAME
import com.example.pacdesarrollo.AdminBBDD.Companion.DATABASE_VERSION

class DataDbHelper (context: Context) : SQLiteOpenHelper(context,DATABASE_NAME,null, DATABASE_VERSION) {
    private val db: SQLiteDatabase
    private val values: ContentValues

    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "Peliculas"
    }

    init {
        db = this.writableDatabase
        values = ContentValues()
    }


    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL(
            "CREATE TABLE " + TablaPelis.Peliculas.NOMBRE_TABLA + "(" +
                    TablaPelis.Peliculas.ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    TablaPelis.Peliculas.COLUMNA_NOMBRE + " TEXT NOT NULL, " +
                    TablaPelis.Peliculas.COLUMNA_VALORACION + " TEXT NOT NULL, " +
                    TablaPelis.Peliculas.COLUMNA_ESTRENO + "TEXT NOT NULL, "
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    fun insertapelis(Pelis:List<Pelis>) {
        values.put(TablaPelis.Peliculas.COLUMNA_NOMBRE,Pelis[0].nombre)
        values.put(TablaPelis.Peliculas.COLUMNA_VALORACION,Pelis[0].valoracion)
        values.put(TablaPelis.Peliculas.COLUMNA_ESTRENO,Pelis[0].fechaestreno)
        db.insert(TablaPelis.Peliculas.NOMBRE_TABLA, null, values)
    }
}


