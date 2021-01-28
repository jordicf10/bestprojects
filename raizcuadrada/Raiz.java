package raizcuadrada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Raiz {
	
private double num;

public Raiz() {
	
	System.out.println("Introduce un número para hallar la raíz cuadrada");
	boolean esraiz=false;
	do {
		try {
			Scanner inserta=new Scanner(System.in);
			num=inserta.nextDouble();
			esraiz=true;
			this.num=num;
		}
		catch (InputMismatchException e) {
			esraiz=false;
			System.out.println("Introduce un nuevo valor válido:");
		}
	}
	while(!esraiz);
	
}

public double getNum() {
	return num;
}

public void setNum(double num) {
	this.num=num;
}

public double CreaRaiz() {
	if(Math.sqrt(num)>=0) {
		return Math.sqrt(num);
	}
	else {
		return 0;
	}
	
}
}


