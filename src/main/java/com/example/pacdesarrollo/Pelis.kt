package com.example.pacdesarrollo

class Pelis {

    var id : Int = 0
    var nombre : String = ""
    var valoracion: Int = 0
    var fechaestreno : Int = 0

    constructor(id:Int,nombre:String,valoracion:Int, fechaestreno:Int ){
        this.id=id
        this.nombre=nombre
        this.valoracion=valoracion
        this.fechaestreno=fechaestreno
    }


    @JvmName("getId1")
    fun getId(): Int {
        return id
    }

    fun getName():String{
        return nombre
    }


    @JvmName("getValoracion1")
    fun getValoracion() : Int{
        return valoracion
    }

    fun getFechaEstreno(): Int {
        return fechaestreno
    }

    @JvmName("setNombre1")
    fun setNombre(nombre:String){
        this.nombre=nombre
    }

    @JvmName("setValoracion1")
    fun setValoracion(valoracion:Int){
        this.valoracion=valoracion
    }

    fun setFechaEstreno(fechaestreno: Int){
        this.fechaestreno=fechaestreno
    }




}