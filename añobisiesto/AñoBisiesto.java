package a�obisiesto;

public class A�oBisiesto {
	
	private int ano;
	
	public A�oBisiesto(int ano) {
		
		this.ano=ano;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano=ano;
	}
	
	

public void esAnoBisiesto() {
	if((ano%4==0 && ano%100==0 && ano%400==0)||ano%4==0 ) {
		System.out.println("El a�o " + ano + " es bisiesto");
	}
	else {
		System.out.println("El a�o " + ano + " no es bisiesto");
	}
}
	/*if(ano%4==0 && ano%100==0) {
		System.out.println("El a�o " + ano + " no es bisiesto");
	}
		else if(ano%4==0) {
			System.out.println("El a�o " + ano + " es bisiesto");
		}
		
				
		}*/

public void esParoNO() {
	if(ano%2==0) {
		System.out.println("El a�o " + ano + " es par");
	}
	else {
		System.out.println("El a�o " + ano + " es impar");
	}
				
		}
			
	}	
	
		









