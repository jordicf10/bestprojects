package Gastos_Personales;

public class Gasto extends Dinero {

    public Gasto(double gasto, String description){
        this.dinero=gasto;
        this.description=description;
    }

    public String toString(){
        return "Gasto: " + getDescription() + ", Cantidad: " + Math.round(getDinero()*100d)/100d + "€";
    }
}
