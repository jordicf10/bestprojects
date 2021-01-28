package pac;

import java.io.Serializable;
import java.util.*;


public class Alumno implements Serializable {



    public long id;
    public String nombre;
    public String nacionalidad;
    public int edad;
    public String sexo;
    public Set<Modulo> alumno_modulo;



    public Alumno() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Set<Modulo> getModulos() {
        return alumno_modulo;
    }

    public void setModulos(Set alumno_modulo) {
        this.alumno_modulo = alumno_modulo;
    }


    public void setAlumnoModulo(Modulo modulo) {
        alumno_modulo.add(modulo);
    }


    public void datosAlumnos(String nombre, String nacionalidad, int edad, String sexo, Set<Modulo> alumno_modulo) {

        setNombre(nombre);
        setNacionalidad(nacionalidad);
        setEdad(edad);
        setSexo(sexo);
        setModulos(alumno_modulo);

    }

    @Override
    public String toString() {

        return "Insert into alumno, nombre: " + getNombre() + ", nacionalidad: " + getNacionalidad() + ", " +
                "edad: " + getEdad() + ", sexo: " + getSexo() + ", modulos: " + getModulos().size();

        }

        }
