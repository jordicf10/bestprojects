package millasejercicio;

import java.util.Scanner;

public class Distancia {
	
	private double millas;
	private boolean esMillasAmetros=false;
	private boolean esMillasAkm=false;
	
	public Distancia() {
		
		this.millas=millas;
		
		}

	
	public double getMillas() {
		return millas;
	}
	
	public void setMillas(double millas) {
		this.millas=millas;
	}
	
	
	double millasAmetros() {
		
		return millas*1609.344;
		
	}
	
	double millasAkm() {

		return millas*1.609344;
	}
	
	void crea() {
		double imillas= 0;
		
		Scanner inserta=new Scanner(System.in);
		
		System.out.println("----CONVERSOR DE MILLAS----\nIntroduce las millas:");
		
		millas=inserta.nextDouble();
		
		this.millas=millas;
		
		int opcion= 0;
		
		System.out.println("\nHas introducido " + millas + " millas. Elige la equivalencia que desees:\n1. Millas a metros\n2. Millas a km ");
		
		opcion=inserta.nextInt();
		
		if(opcion==1) {
			esMillasAmetros=true;
		}
		if(opcion==2) {
			esMillasAkm=true;
		}
	
	}
	
	public String toString() {
		if(esMillasAmetros) {
			
		
			if(esMillasAkm) {
			
		}
			return "Has introducido " + millas + " millas, que pasadas a metros equivalen a " + millasAmetros() + " metros";
	}
		
		return "Has introducido " + millas + " millas, que pasadas a km equivalen a " + millasAkm() + " km";
	}
		
		
}




