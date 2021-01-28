package com.example.pacdesarrollo

class TablaPelis {

    abstract class Peliculas{
        companion object{
            val ID="id"
            val NOMBRE_TABLA = "peliculas"
            val COLUMNA_NOMBRE= "nombre"
            val COLUMNA_VALORACION= "valoracion"
            val COLUMNA_ESTRENO= "fecha"
            var listaPelis: MutableList<Pelis> = ArrayList()


        }
    }
}