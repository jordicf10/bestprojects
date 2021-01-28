package conversordivisas;

import java.util.Scanner;

public class DivisasMain {

	public static void main(String[] args) {
		
		System.out.println("-------CONVERSOR DE DIVISAS-------\n");
		
		int opcion=0;
		
		do {
		
		System.out.println("\nElige tu opción:\n\n1. Convertir EUROS a LIBRAS\n\n2. Convertir LIBRAS a EUROS\n\n3. Salir del conversor");
		
		Scanner inserta=new Scanner(System.in);
		
		opcion=inserta.nextInt();
		
		switch(opcion) {
		
		
		case 1:
			System.out.println("\nIntroduce los euros que quieres convertir a libras:");
			double smoneyeuros= inserta.nextDouble();
			ConversorDivisas p1=new ConversorDivisas();
			p1.setMoneyEuros(smoneyeuros);
			System.out.println("\nDeseas el tipo de cambio por defecto, 0.85, o deseas establecerlo?\n1. Tipo por defecto del 0.85"
					+ "\n2. Deseo establecer el tipo de cambio");
			
			System.out.println();
			
			opcion=inserta.nextInt();
			
			switch(opcion) {
			case 1:
				ConversorDivisas p2=p1;
				System.out.println("\nDeseas convertir " + p2.getMoneyEuros() + " euros a libras y el "
						+ "resultado es " + p2.eurosToLibras() + " libras");
				break;
			case 2:
				System.out.println("\nIntroduce el tipo de cambio que desees:");
				double cambio= inserta.nextDouble();
				ConversorDivisas p3=new ConversorDivisas(cambio);
				System.out.println("Deseas convertir " + p3.getMoneyEuros() + " euros a libras y el "
						+ "resultado es " + p3.eurosToLibras() + " libras");
				break;
				
			}
			break;
			
		case 2:
			System.out.println("\nIntroduce las libras que quieres convertir a euros:");
			double smoneylibras= inserta.nextDouble();
			ConversorDivisas p=new ConversorDivisas();
			p.setMoneyLibras(smoneylibras);
			System.out.println("\nDeseas el tipo de cambio por defecto, 0.85, o deseas establecerlo?\n1. Tipo por defecto del 0.85"
					+ "\n2. Deseo establecer el tipo de cambio");
			
			System.out.println();
			
			opcion=inserta.nextInt();
			
			switch(opcion) {
			case 1:
				ConversorDivisas p4=p;
				System.out.println("\nDeseas convertir " + p4.getMoneyEuros() + " libras a euros y el "
						+ "resultado es " + p4.librasToEuros() + " euros");
				break;
			case 2:
				System.out.println("\nIntroduce el tipo de cambio que desees:");
				double cambio= inserta.nextDouble();
				ConversorDivisas p3=new ConversorDivisas(cambio);
				System.out.println("Deseas convertir " + p3.getMoneyLibras() + " libras a euros y el "
						+ "resultado es " + p3.librasToEuros() + " euros");
				break;
				
			}
			break;
			
		case 3:
			System.out.println("Fin del programa");
			break;
			
		}
		}
		while(opcion!=3);
		
		
		
		
		
		/*ConversorDivisas euralibras=new ConversorDivisas();
		
		euralibras.setMoneyEuros(400);
		
		System.out.println("Deseas convertir " + euralibras.getMoneyEuros() + " euros a libras y el "
				+ "resultado es " + euralibras.eurosToLibras() + " libras");
		
		System.out.println();
		
		ConversorDivisas euralibras2=new ConversorDivisas(0.90);
		
		euralibras2.setMoneyEuros(400);
		
		System.out.println("Deseas convertir " + euralibras2.getMoneyEuros() + " euros a libras y el "
				+ "resultado es " + euralibras2.eurosToLibras() + " libras");
		
		System.out.println();
		
		
		ConversorDivisas libraeur=new ConversorDivisas();
		
		libraeur.setMoneyLibras(400);
		
		System.out.println("Deseas convertir " + libraeur.getMoneyLibras() + " libras a euros y el "
				+ "resultado es " + libraeur.librasToEuros() + " euros");
		
		
		System.out.println();
		
		
		ConversorDivisas libraeur2=new ConversorDivisas(1.12);
		
		libraeur2.setMoneyLibras(400);
		
		System.out.println("Deseas convertir " + libraeur2.getMoneyLibras() + " libras a euros y el "
				+ "resultado es " + libraeur2.librasToEuros() + " euros");*/
		
		

	}

}
