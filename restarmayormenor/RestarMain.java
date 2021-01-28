package restarmayormenor;

import java.util.Scanner;

public class RestarMain {

	public static void main(String[] args) {
		Restar resta= new Restar();
		
		
		
		Scanner inserta=new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Introduce tu primer número:");

		resta.setNum1(num1=inserta.nextDouble());
		
		System.out.println("Introduce tu segundo número:");
		
		resta.setNum2(num2=inserta.nextDouble());
		
	System.out.println();
		
		
		
		System.out.println("Habiendo insertado en primer lugar el número " + resta.getNum1() + " \ny en "
				+ " segundo lugar el número " + resta.getNum2() + ", \ny teniendo en cuenta que " + resta.cualesmayor() + " es mayor que " + resta.cualesmenor() + " \nel resultado"
						+ " restándole el número inferior al superior será de " + resta.creaResta());

	
	}
}






