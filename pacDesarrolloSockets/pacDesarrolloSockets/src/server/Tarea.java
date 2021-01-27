package server;


public class Tarea {

	String descripcion;
	String estado;

	public Tarea(String descripcion, String estado) {
		this.descripcion=descripcion;
		this.estado=estado;
	}
	
	public String getdescripcion() {
		return descripcion;
	}
	
	public void setdescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	
	public String getestado() {
		return estado;
	}
	
	public void setestado(String estado) {
		this.estado=estado;
	}

	
	public String toString(){
		
		
		return "\nTarea:\nDescripción: " + descripcion + "\nEstado de la tarea: " + estado;
	}
	
}



		
	


