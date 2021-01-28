package pac;


import java.io.Serializable;



public class Modulo implements Serializable{



    public long id;
    public String nombre;
    public String codigo;

    public Modulo(){

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public void datosmodulos(String nombre, String codigo) {

        setNombre(nombre);
        setCodigo(codigo);

    }



    @Override
    public String toString() {
        return "Insert into modulo, nombre: " + getNombre() + ", codigo: " + getCodigo();
    }
}

