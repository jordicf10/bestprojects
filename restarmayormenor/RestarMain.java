package restarmayormenor;

import java.util.Scanner;

public class RestarMain {

	public static void main(String[] args) {
		Restar resta= new Restar();
		
		
		
		Scanner inserta=new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Introduce tu primer n�mero:");

		resta.setNum1(num1=inserta.nextDouble());
		
		System.out.println("Introduce tu segundo n�mero:");
		
		resta.setNum2(num2=inserta.nextDouble());
		
	System.out.println();
		
		
		
		System.out.println("Habiendo insertado en primer lugar el n�mero " + resta.getNum1() + " \ny en "
				+ " segundo lugar el n�mero " + resta.getNum2() + ", \ny teniendo en cuenta que " + resta.cualesmayor() + " es mayor que " + resta.cualesmenor() + " \nel resultado"
						+ " rest�ndole el n�mero inferior al superior ser� de " + resta.creaResta());

	
	}
}






