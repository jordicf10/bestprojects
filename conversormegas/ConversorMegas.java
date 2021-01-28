package conversormegas;

import java.util.Scanner;

public class ConversorMegas {
//PELS DUBTES, CONSULTAR EXERCICI PES
	
	private int num;
	private int esbit;
	private int unidad;
	private int esbyte;
	private int esgigabyte;
	private int esgigabit;
	private int esmegabyte;
	private boolean esbitbool= false;
	private boolean esbytebool= false;
	private boolean esgigabytebool= false;
	private boolean esgigabitbool= false;
	private boolean esmegabytebool= false;
	
	public ConversorMegas() {
		Scanner inserta=new Scanner(System.in);
		System.out.println("Inserta el dígito que desees:");
		int esnumconv= inserta.nextInt();
		this.num=esnumconv;
		System.out.println("Elige de qué unidad se trata:\nBit\nByte\nGigabyte\nGigabit\nMegabyte");
		String unidadcon= inserta.next();
		
		if(unidadcon=="Bit") {
			this.unidad=this.esbit;
			esbitbool=true;
		}
		if(unidadcon=="Byte") {
			this.unidad=this.esbyte;
			esbytebool= true;
		}
		if(unidadcon=="Gigabyte") {
			this.unidad=this.esgigabyte;
			esgigabytebool=true;
		}
		if(unidadcon=="Gigabit") {
			this.unidad=this.esgigabit;
			esgigabitbool= true;
		}
		if(unidadcon=="Megabyte") {
			this.unidad=this.esmegabyte;
			esmegabytebool= true;
		}
		
	
		System.out.println("---BIENVENIDO AL CONVERSOR DE UNIDADES----\n\n1. Convertir a Bits\n\n"
				+ "2. Convertir a Bytes\n\n3. Convertir a Gigabytes\n\n4. Convertir a Gigabits\n\n5. "
				+ "Convertir a Megabytes\n\n6. Salir del conversor ");
		
		
		
		int opcion= 0;
		
		do {
			
		
		opcion=inserta.nextInt();
		
		switch(opcion) {
		
		case 1:
			esbitbool=true;
			break;
			
		case 2:
			esbytebool= true;
			break;
			
		case 3:
			esgigabytebool= true;
			break;
			
		case 4:
			esgigabitbool= true;
			break;
			
		case 5:
			esmegabytebool= true;
			break;
			
		case 6:
			System.out.println("Fin del programa");
			break;
			
		}
		
		
	}
		while(opcion<1 && opcion>6);
			}
	
	public int getNum() {
		return num;
	}
	
	public int getEsbit() {

		if(esbytebool) {
			return num*8;
		}
		
		if(esgigabytebool) {
			return (int) (num*(Math.pow(10, 8)*8));
		}
		
		if(esgigabitbool) {
			return num*1000000000;
		}
		
		if(esmegabytebool) {
			return num*8000000;
		}
		else {
			return num;
		}
		
	}
	
	public void setEsbit(int esbit) {
		this.esbit=esbit;
	}
	
	public int getUnidad() {
		return unidad;
	}
	
	public void setUnidad(int unidad) {
		this.unidad=unidad;
	}
	
	public double getEsByte() {
		if (esbitbool) {
			return num*0.125;
		}
		
		if(esgigabytebool) {
			return num*(9.31*(Math.pow(10, -10)));
		}
		
		if(esgigabitbool) {
			return num*(7.451*(Math.pow(10, -9)));
		}
		
		if(esmegabytebool) {
			return num*(9.537*(Math.pow(10, -7)));
		}
		
		else {
			return num;
		}
		
	}
	
	
	public void setEsByte(int esbyte) {
		this.esbyte=esbyte;
	}
	
	public int getEsGigabyte() {
		if (esbitbool) {
			return (int) (num*0.0858);
		}
		if (esbytebool) {
			return (int) (num*0.000000000107);
		}
		
		if(esgigabitbool) {
			return num*8;
		}

		if(esmegabytebool) {
			return num*1024;
		}
		
		
		else{
			return num;
		}
	}
	
	public void setEsGigabyte(int esgigabyte) {
		this.esgigabyte=esgigabyte;
	}
	
	public int getEsGigabit() {
		if (esbitbool) {
			return (int) (num*0.0107);
		}
		if (esbytebool) {
			return (int) (num*0.00000000134);
		}
		if (esgigabytebool){
			return (int) (num*0.125);
		}
		

		if(esmegabytebool) {
			return num*128;
		}

		else {
			return num;
		}
	}
	
	public void setEsGigabit(int esgigabit) {
		this.esgigabit=esgigabit;
	}
	
	public int getEsMegabyte() {
		if (esbitbool) {
			return (int) (num*0.00119);
		}
		if (esbytebool) {
			return num*1048576;
		}
		if (esgigabytebool){
			return (int) (num*0.00009765625);
		}
		

		if(esgigabitbool) {
			return (int) (num*0.0078125);
		}

		else {
			return num;
		}
	}
	
	public void setEsMegabyte(int esmegabyte) {
		this.esmegabyte=esmegabyte;
	}
	
	public String toString() {
		if(esbitbool) {
			
			if(esbytebool) {
		
					if(esgigabytebool) {
						
							if(esgigabitbool) {
								
								if(esmegabytebool) {
									
			
									
			
	
	return getNum() + " megabytes es igual a: \n1. Bits: " + getEsbit() + " bits\n2. "
	+ "Bytes: " + getEsByte() + " bytes\n3. Gigabytes: " + getEsGigabyte() + " gigabytes\n3. "
			+ "Gigabits: " + getEsGigabit() + " gigabits\n4. Megabytes: " + getEsMegabyte(); 
								}
							
								return getNum() + " gigabits es igual a: \n1. Bits: " + getEsbit() + " bits\n2. "
								+ "Bytes: " + getEsByte() + " bytes\n3. Gigabytes: " + getEsGigabyte() + " gigabytes\n3. "
										+ "Gigabits: " + getEsGigabit() + " gigabits\n4. Megabytes: " + getEsMegabyte(); 
							}
			

							return getNum() + " gigabytes es igual a: \n1. Bits: " + getEsbit() + " bits\n2. "
							+ "Bytes: " + getEsByte() + " bytes\n3. Gigabytes: " + getEsGigabyte() + " gigabytes\n3. "
									+ "Gigabits: " + getEsGigabit() + " gigabits\n4. Megabytes: " + getEsMegabyte(); 
					}
			
			

					return getNum() + " bytes es igual a: \n1. Bits: " + getEsbit() + " bits\n2. "
					+ "Bytes: " + getEsByte() + " bytes\n3. Gigabytes: " + getEsGigabyte() + " gigabytes\n3. "
							+ "Gigabits: " + getEsGigabit() + " gigabits\n4. Megabytes: " + getEsMegabyte(); 
			

			}
	
		

}
		return getNum() + " bits es igual a: \n1. Bits: " + getEsbit() + " bits\n2. "
		+ "Bytes: " + getEsByte() + " bytes\n3. Gigabytes: " + getEsGigabyte() + " gigabytes\n3. "
				+ "Gigabits: " + getEsGigabit() + " gigabits\n4. Megabytes: " + getEsMegabyte(); 
	}
}


	

	
	







	


	
	


