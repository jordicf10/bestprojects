package raizcuadrada;

public class RaizMain {

	public static void main(String[] args) {
		
		
		
		
		boolean espositivo=false;
		
		do {
			
			
			Raiz r1=new Raiz();
			
			System.out.println();
			
			
		if (r1.CreaRaiz()>0) {

			System.out.println("La raíz cuadrada de " + r1.getNum() + " es igual a = " + (String.format("%.4f", r1.CreaRaiz())));
			
			espositivo=true;
		}
		else {
			
			System.out.println("La raíz debe ser positiva. Introduce un nuevo valor:");
			espositivo=false;
		}

	}
		while(!espositivo);

}
}
