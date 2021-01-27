package Gastos_Personales;

public class Ingreso extends Dinero {

    public Ingreso(double ingreso, String description){
        this.dinero=ingreso;
        this.description=description;
    }

    public String toString(){
        return "Ingreso: " + getDescription() + ", Cantidad: " + Math.round(getDinero()*100d)/100d + "€";
    }
}
