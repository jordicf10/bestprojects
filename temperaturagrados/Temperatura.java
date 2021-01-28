package temperaturagrados;

public class Temperatura{
	
	private double tempC;
	private double tempF;
	
	
	public Temperatura() {
	
	}
		

	public double getTempC() {
		return tempC;
	}
	
	public void setTempC(double tempC) {
		this.tempC=tempC;
		
	}
	
	public double getTempF() {
		return tempF;
	}
	
	public void setTempF(double tempF) {
		this.tempF=tempF;
		
	}
	
	
	double celsiusToFahrenheit() {
		return tempC*1.8+32;
	
		
	}
	
	double fahrenheitToCelsius() {
		return (tempF-32)/1.8;
		
	}
	
}
