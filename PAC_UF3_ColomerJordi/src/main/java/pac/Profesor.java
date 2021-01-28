package pac;



import java.io.Serializable;


public class Profesor implements Serializable{



    public long id;
    public String nombre;
    public String sexo;
    public Profesor() {

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public void datosprofesores(String nombre, String sexo) {

        setNombre(nombre);
        setSexo(sexo);


    }


    @Override
    public String toString() {
        return "Insert into profesor, nombre: " + getNombre() + ", sexo: " + getSexo();
    }
}

