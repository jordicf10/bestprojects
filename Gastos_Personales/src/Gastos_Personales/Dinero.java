package Gastos_Personales;

public abstract class Dinero {

    protected double dinero;
    protected String description;


    public double getDinero(){
        return dinero;
    }

    public void setDinero(double dinero){
        this.dinero=dinero;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(){
        this.description=description;
    }

}
