package temperaturagrados;

public class Maingrados {

	public static void main(String[] args) {
		
		Temperatura cels=new Temperatura();
		
		cels.setTempC(26);
		System.out.print("La temperatura de hoy es de " + cels.getTempC() + " grados celsius, y pasado a grados fahrenheit"+
		" tenemos una temperatura de ");
		System.out.printf( "%.2f",cels.celsiusToFahrenheit());
		System.out.println(" grados fahrenheit");
		
		System.out.println();
		
		Temperatura fahren=new Temperatura();
		fahren.setTempF(60);
		
		System.out.print("La temperatura de hoy es de " + fahren.getTempF() + " grados fahrenheit, y pasado a grados celsius"+
				" tenemos una temperatura de ");
		System.out.printf("%.2f",fahren.fahrenheitToCelsius()); 
		System.out.println(" grados celsius");
		
		
	

	}

}
