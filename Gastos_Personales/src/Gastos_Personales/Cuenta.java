package Gastos_Personales;

import java.util.*;

public class Cuenta {

    private double saldo;
    private Usuario usuario;
    private List<Gasto> gastos;
    private List<Ingreso> ingresos;

    public Cuenta(Usuario usuario) {
        this.usuario = usuario;
        this.saldo = 0;
        this.gastos = new ArrayList<Gasto>();
        this.ingresos = new ArrayList<Ingreso>();

    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Gasto> getGastos() {
        return this.gastos;
    }

    public List<Ingreso> getIngresos() {
        return this.ingresos;
    }


    public double addIngresos(String description, double cantidad) {

        Ingreso ingreso1 = new Ingreso(cantidad, description);  //Creamos el objeto ingreso1 para luego pasarle los ingresos
        this.ingresos.add(ingreso1);

        this.saldo += cantidad;
        return this.saldo;
    }

    public double addGastos(String description, double cantidad) {
        Gasto gasto1 = new Gasto(cantidad, description);
        this.gastos.add(gasto1);  //Añadimos el gasto deseado al objeto de la clase Gasto

        this.saldo-=cantidad;       //El saldo pasará a ser saldo menos la cantidad que le pasemos
        return this.saldo;
    }

    public String toString() {

        return "El saldo actual de la cuenta es: " + Math.round(getSaldo()*100d)/100d + "€";
        //Usamos el método round de la clase Math para redondear a dos decimales
    }

}



