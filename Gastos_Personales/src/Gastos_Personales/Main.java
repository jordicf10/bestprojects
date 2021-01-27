package Gastos_Personales;

import java.util.*;

public class Main {

    public static Usuario usuario = new Usuario();
    public static Cuenta cuenta1 = new Cuenta(usuario);
    public static Scanner entrada = new Scanner(System.in);
    public static List<Ingreso> ingresostotales = new ArrayList<Ingreso>();
    public static List<Gasto> gastostotales = new ArrayList<Gasto>();


    public static void main(String[] args) {

        creacionusuario();

        mostrarmenu();

    }

    public static void creacionusuario(){

        String nombre_usuario;
        System.out.println("Introduce el nombre de usuario");

        do {
            nombre_usuario = entrada.nextLine();
            usuario.setNOMBRE(nombre_usuario);
            if (!usuario.setNOMBRE(nombre_usuario)) {
                System.out.println("Nombre introducido incorrecto\nIntroduce un nombre válido");
            }
        }
        while(!usuario.setNOMBRE(nombre_usuario));


        int edad_usuario=0;
        boolean edadcorrecta=true;

        System.out.println("Introduce la edad del usuario");

        do {

            try {
                edad_usuario = entrada.nextInt();
                edadcorrecta=false;

            } catch (InputMismatchException e) {
                System.out.println("Carácteres no aceptados\nIntroduce una edad válida");
                entrada.nextLine();
            }
        }
        while(edadcorrecta);


        String dni;

        System.out.println("Introduce el DNI del usuario");
        do {
            dni = entrada.next();
            usuario.setDNI(dni);
            if (!usuario.setDNI(dni)) {
                System.out.println("DNI introducido incorrecto\nIntroduce el DNI del usuario válido");
            }
        }
        while (!usuario.setDNI(dni));


        cuenta1 = new Cuenta(usuario);
        System.out.println("Usuario creado correctamente");
    }


    public static void mostrarmenu() {

        System.out.println("Realiza una nueva acción\n1 Introduce un nuevo gasto\n2 Introduce un nuevo ingreso\n3 " +
                "Mostrar gastos\n4 Mostrar ingresos\n5 Mostrar saldo\n0 Salir");

        int opcion= 0;
        boolean opcioncorrecta= true;

        do {

            try {
                opcion = entrada.nextInt();
                opcioncorrecta = false;
            } catch (InputMismatchException e) {
                System.out.println("Carácteres no aceptados\nIntroduce una opción del menú válida\n1 Introduce un nuevo gasto\n2 Introduce" +
                        " un nuevo ingreso\n3 Mostrar gastos\n4 Mostrar ingresos\n5 Mostrar saldo\n0 Salir");
                entrada.nextLine();
            }
        }
        while(opcioncorrecta);

        entrada.nextLine();

        if (opcion < 0 || opcion > 5) {
            System.out.println("Vuelve a introducir una opción válida");
            mostrarmenu();
        }

            switch (opcion) {

                case 0:
                    System.out.println("Fin del programa.\nGracias por utilizar la aplicación");
                    break;

                case 1:
                    insertagastos();
                    mostrarmenu();
                    break;

                case 2:
                    insertaingresos();
                    mostrarmenu();
                    break;

                case 3:
                    muestraGastos();
                    mostrarmenu();
                    break;

                case 4:
                    muestraIngresos();
                    mostrarmenu();
                    break;

                case 5:
                    muestrasaldo();
                    mostrarmenu();
                    break;
            }
        }


    public static void insertagastos() {     //Método para insertar gastos
        String describeGastos = "";
        double cifraGastos = 0;
        boolean saldopositivo = false;

        System.out.println("Introduce la descripción");
        describeGastos = entrada.nextLine();

        do{
            try{        //Primero un try...catch para controlar que la cantidad se introduzca en números
                System.out.println("Introduce la cantidad");
                cifraGastos = entrada.nextDouble();
                saldopositivo=true;
            }
            catch(InputMismatchException e){
                System.out.println("Cantidad no válida");
                entrada.next();
            }
        }
        while(!saldopositivo);

        saldopositivo=false;

        try {
            if (cifraGastos > cuenta1.getSaldo()) {   //Si el gasto que añadimos es superior al saldo, lanzará la excepción
                saldopositivo = true;
                throw new GastoException();
            }
        }
        catch (GastoException e) {
            System.out.print("No dispones de suficiente dinero para efectuar la operación. Solo dispones de ");
            System.out.printf("%1.2f", cuenta1.getSaldo());
            System.out.print("€");
            System.out.println();
            entrada.nextLine();
        }

        if (!saldopositivo) {     /*Si se ha lanzado la excepción, solo lanzará el código de la excepción
                                    Si no se lanza la excepción, el gasto se añadirá*/

            System.out.print("Saldo restante: ");
            System.out.printf("%1.2f", cuenta1.addGastos(describeGastos, cifraGastos));  //Printf para redondear a dos decimales
            System.out.print("€");
            System.out.println();
            entrada.nextLine();
        }

    }

    public static void insertaingresos(){
        String describeIngresos= "";
        double cifraIngresos= 0;
        boolean ingresovalido= true;

        System.out.println("Introduce la descripción");
        describeIngresos = entrada.nextLine();

        do{
            try{     //Try...catch para controlar que la cantidad se introduzca en números
                System.out.println("Introduce la cantidad");
                cifraIngresos = entrada.nextDouble();
                ingresovalido= false;
            }
            catch(InputMismatchException e){
                System.out.println("Cantidad no válida");
                entrada.next();
            }
        }
        while(ingresovalido);

        System.out.print("Saldo restante: ");
        System.out.printf("%1.2f", cuenta1.addIngresos(describeIngresos, cifraIngresos));
        System.out.print("€");
        System.out.println();
        entrada.nextLine();

    }


    public static void muestraIngresos(){
        ingresostotales=cuenta1.getIngresos();
        for(int i=0;i<ingresostotales.size();i++){
            System.out.println(ingresostotales.get(i));
        }
    }


    public static void muestraGastos(){
        gastostotales=cuenta1.getGastos();
        for(int i=0;i<gastostotales.size();i++){
            System.out.println(gastostotales.get(i));
        }
    }


    public static void muestrasaldo(){
        System.out.println(cuenta1.toString());
    }

}
