package añobisiesto;

public class AñoBisiesto {
	
	private int ano;
	
	public AñoBisiesto(int ano) {
		
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
		System.out.println("El año " + ano + " es bisiesto");
	}
	else {
		System.out.println("El año " + ano + " no es bisiesto");
	}
}
	/*if(ano%4==0 && ano%100==0) {
		System.out.println("El año " + ano + " no es bisiesto");
	}
		else if(ano%4==0) {
			System.out.println("El año " + ano + " es bisiesto");
		}
		
				
		}*/

public void esParoNO() {
	if(ano%2==0) {
		System.out.println("El año " + ano + " es par");
	}
	else {
		System.out.println("El año " + ano + " es impar");
	}
				
		}
			
	}	
	
		









