package com.example.pacdesarrollo

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns


class AdminBBDD(context: Context?, s: String, nothing: Nothing?, i: Int) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    object TablaData : BaseColumns {
        const val NTABLA = "Tabla"
        const val IDCOLUMNA = "id"
        const val PELICULASCOL = "peliculas"
        const val VALORACIONCOL = "valoración"
        const val ESTRENOCOL = "fecha de estreno"

        const val TABLAPELIS = "CREATE TABLE " + NTABLA + " (" +
                IDCOLUMNA + " INTEGER PRIMARY KEY," +
                PELICULASCOL + "TEXT_TYPE," +
                VALORACIONCOL + "TEXT_TYPE," + ESTRENOCOL + "TEXT_TYPE)"

        const val ELIMINA_SQLENTRADAS = "DROP TABLE IF EXISTS " + NTABLA
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(TablaData.TABLAPELIS)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL(TablaData.ELIMINA_SQLENTRADAS)
        onCreate(db)
    }

    companion object {
        fun getReadableDatabase(): Unit = Unit

        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "MisPeliculas.db"
    }
}
