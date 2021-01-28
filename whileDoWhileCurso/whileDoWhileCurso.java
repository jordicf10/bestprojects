package whileDoWhileCurso;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class whileDoWhileCurso {

	public static void main(String[] args) {
		
		int origen= 0;
		int fin= 0;
		
		Scanner numero= new Scanner(System.in);
		
		System.out.println("Elige la cifra desde la que quieres empezar a contar");
		
		origen= numero.nextInt();
		
		System.out.println("Elige la cifra donde deseas finalizar el conteo");
		
		do {
			boolean fincorrecto= false;
			do {
				try {
					fin= numero.nextInt();
					if(fin<origen) {
						System.out.println("Debes insertar una cifra de fin superior "
								+ " a la inicial");
					}
					fincorrecto=true;
				}
				catch(InputMismatchException e) {
					System.out.println("Introduce una cifra de fin válida");
					numero.nextLine();
				}
				
			}
			while(!fincorrecto);
			
		}
		while(fin<origen);
		
		
		for(origen=origen;origen<=fin;origen++) {
			System.out.println(origen);
		}
		
		/*while(origen<fin) {
			System.out.println(origen);
			origen++;
		}*/
		
}

}
