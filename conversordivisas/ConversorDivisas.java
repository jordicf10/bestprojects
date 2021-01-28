package conversordivisas;


public class ConversorDivisas {
	
	private static double moneyeuros;
	private static double moneylibras;
	private static double moneycambio;
	
	
	public ConversorDivisas() {
		this.moneycambio=0.85;
		
	}
	
	
	public ConversorDivisas(double moneycambio) { 
		this.moneycambio=moneycambio;
	}
	
	
	public double getMoneyEuros() {
		return moneyeuros;
	}
	
	public void setMoneyEuros(double moneyeuros) {
		this.moneyeuros=moneyeuros;
	}
	
	
	public double getMoneyLibras() {
		return moneylibras;
	}
	
	public void setMoneyLibras(double moneylibras) {
		this.moneylibras=moneylibras;
	}
	
	
	public static double librasToEuros() {
			return moneylibras*moneycambio;

	}
	
	
	public static double eurosToLibras() {
			return moneyeuros*moneycambio;
		
}
}

