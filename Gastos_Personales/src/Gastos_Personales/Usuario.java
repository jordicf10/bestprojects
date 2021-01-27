package Gastos_Personales;

import java.util.regex.Matcher;

import java.util.*;

public class Usuario {

    private String nombre;
    private int edad;
    private String dni;



    public Usuario() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean setNOMBRE( String nombre) {
        if(nombre.matches("^[A-Za-z].*$")) {   //Para introducir un nombre solo con letras, con o sin espacios
            this.nombre = nombre;
            return true;

        } else {
            return false;
        }

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;

    }

    public boolean setDNI( String dni) {
    if(dni.matches("^[0-9]{8}-?[A-Za-z]$")) {  /*Para introducir al inicio 8 números, que se pueda poner o no
                                                        /guión, y una sola letra*/
        this.dni = dni;
        return true;

    } else {
        return false;
    }

}

    public String toString(){
        return "El usuario se llama " + getNombre() + ", tiene " + getEdad() + " años y su DNI es " + getDni();
    }
}
