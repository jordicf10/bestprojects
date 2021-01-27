public class Persona implements Comparable<Persona> {
	
	private int numero;
	private int puntos;
	
	public Persona(int numero, int puntos) {

		this.numero=numero;
		this.puntos=puntos;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public void setPuntos(int puntos) {
		this.puntos=puntos;
	}
	
	
	@Override
	public int compareTo(Persona o) {
		if(this.getPuntos()<o.getPuntos()) {
				return +1;
		}
				if(this.numero<o.getNumero()) {
					return -1;
		}
		else if(this.getPuntos()>o.getPuntos()) {
			return -1;
		}
			if(this.numero>o.getNumero()) {
				return +1;
		}
		else return 0;
		}
		}
	


	
