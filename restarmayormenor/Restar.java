package restarmayormenor;

public class Restar {
	
	private double num1;
	private double num2;
	
	public Restar() {
		
	}
	
	public double getNum1() {
		return num1;
	}
	
	public void setNum1(double num1) {
		this.num1=num1;
	}
	
	public double getNum2() {
		return num2;
	}
	
	public void setNum2(double num2) {
		this.num2=num2;
	}

	
	public double creaResta() {
		if(num1>num2) {
			return num1-num2;
		}
		else {
			return num2-num1;
		}
	}
	
	public double cualesmayor() {
		
		if(num1<num2) {
			return num2;
			
		}
		else {
			return num1;
		}
	}

	public double cualesmenor() {
		
		if(num1>num2) {
			return num2;
			
		}
		else {
			return num1;
		}
	}
	}


