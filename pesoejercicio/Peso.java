package pesoejercicio;

import java.util.Scanner;


public class Peso {
	
	private double peso;
	private double unidadmedida;
	private double libras;
	private double onzas;
	private double kilogramos;
	private double gramos;
	private boolean blibras=false;
	private boolean bkilogramos=false;
	private boolean bonzas=false;
	private boolean bgramos=false;
	
	
	public Peso() {
		
		Scanner inserta=new Scanner(System.in);
		System.out.println("Elige el peso que deseas convertir:");
		peso= inserta.nextDouble();
		this.peso=peso;
		
		int opcion=0;
		
		do {
			System.out.println("Selecciona la unidad de medida:\n1. Libras\n2. Onzas\n3. Kilogramos\n4. Gramos");
			opcion=inserta.nextInt();
			if(opcion<1 || opcion>4) {
			System.out.println("Vuelve a introducir una opción válida, entre 1 y 4");
		}
		}
		while(opcion<1 || opcion>4);
		
		if(opcion==1) {
			this.unidadmedida=this.libras;
			blibras=true;
		}
		if(opcion==2) {
			this.unidadmedida=this.onzas;
			bonzas=true;
		}
		if(opcion==3) {
			this.unidadmedida=this.kilogramos;
			bkilogramos=true;
		}
		if(opcion==4) {
			this.unidadmedida=this.gramos;
			bgramos=true;
		}
		
	}
	
	
	public double getLibras() {
		if(blibras) {
			return peso;
		}
		if(bonzas) {
			return peso*0.0625;
		}
		if(bkilogramos) {
			return peso*2.2046;
		}
		else {
				return peso*0.0022;
			}
	}
	
	
	public void setLibras(double libras) {
		this.libras=libras;
	}
	
	public double getOnzas() {
		if(blibras) {
			return peso*16;
		}
		if(bonzas) {
			return peso;
		}
		if(bkilogramos) {
			return peso*35.2739;
		}
			else{
				return peso*0.0352;
			}
	}
	
	public void setOnzas(double onzas) {
		this.onzas=onzas;
	}
	
	public double getKilogramos() {
		if(blibras) {
			return peso*0.4535;
		}
		if(bonzas) {
			return peso*0.0283;
		}
		if(bkilogramos) {
			return peso;
		}
			else{
				return peso*0.001;
			}
	}
	
	public void setKilogramos(double kilogramos) {
		this.kilogramos=kilogramos;
	}
	
	public double getGramos() {
		if(blibras) {
			return peso*453.5923;
		}
		if(bonzas) {
			return peso*28.3495;
		}
		if(bkilogramos) {
			return peso*1000;
		}
			else{
				return peso;
			}
	}
	
	public void setGramos(double gramos) {
		this.gramos=gramos;
	}
	
	public String toString() {
		
	
	if(bonzas) {
	return "El peso " + peso + " onzas se pasa a:\n1. Libras: " + getLibras() + " libras.\n2. Kilogramos: " + getKilogramos() + " kg.\n3. Gramos: " + getGramos() + " gramos.";
	}
	if(bkilogramos) {
	return "El peso " + peso + " kilogramos se pasa a:\n1. Libras: " + getLibras() + " libras.\n2. Onzas: " +getOnzas() + " onzas.\n3. Gramos: " + getGramos() + " gramos.";
	}
	if(bgramos) {
	return "El peso " + peso + " gramos se pasa a:\n1. Libras: " + getLibras() + " libras.\n2. Kilogramos: " + getKilogramos() + " kg.\n3. Onzas: " + getOnzas() + " onzas.";
	}
	if(blibras) {
	

	}
	return "El peso " + peso + " libras se pasa a:\n1. Onzas: " + getOnzas() + " onzas.\n2. Kilogramos: " + getKilogramos() + " kg.\n3. Gramos: " + getGramos() + " gramos.";
	}
	
	}
	


	



