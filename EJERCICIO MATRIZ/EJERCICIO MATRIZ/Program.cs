using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EJERCICIO_MATRIZ
{
    class Program
    {
        static void Main(string[] args)
        {

            int filas;                   //Declaramos las variables filas y columnas con las que definiremos nuestra matriz
            int columnas;

            do                         /*Como queremos una matriz cuadrada, con el mismo número de filas y de columnas, hacemos un do...while para asegurarnos que 
                                       vamos a pedir las filas y las columnas mientras los dos datos introducidos sean distintos*/
            {
                Console.WriteLine("--------------TAMAÑO DE MATRIZ--------------\n\n");
                Console.WriteLine("Antes de entrar al menú, selecciona el número de filas que deseas que tenga la matriz:");
                filas = Int32.Parse(Console.ReadLine());

                Console.WriteLine("\nSelecciona el número de columnas que deseas que tenga la matriz:");
                columnas = Int32.Parse(Console.ReadLine());

                if (filas != columnas)               //Si los dos números no coinciden se nos mostrará un mensaje de error para que volvamos a insertar dichos datos
                {
                    Console.WriteLine("\nRequisito no cumplido. El número de filas y columnas debe ser el mismo. Vuelve a introducir los datos.\n" +
                                      "Pulsa cualquier tecla para continuar y asegúrate que estás introduciendo una matriz cuadrada");
                    Console.ReadKey();
                    Console.Clear();
                }


            }
            while (filas != columnas);    //Mientras las filas sean distintas a las columnas se repetirá el código de dentro del do

            int[,] matriz1 = new int[filas, columnas];      //Declaramos la variable de la matriz con las filas y columnas que hemos insertado

            Console.WriteLine("\nCon los valores introducidos, [" + filas + "," + columnas + "], deberás introducir " + (filas * columnas) + " números en la matriz.\nPulsa una tecla para ir al menú de selección");
            Console.ReadKey();                    //Imprimos un mensaje para informar al usuario de los datos insertados y con una multiplicación de ambos números 
                                                  //facilitamos la cantidad de números que deberemos introducir
            int seleccion = 0;                    

            Console.Clear();     //Vaciamos la pantalla para limpiar el contenido y presentar el menú de selección

            do                       //Hacemos otro bucle do...while para seleccionar la opción que queramos y que se nos pregunte mientras no cumplamos con los requisitos exigidos
            {

                Console.WriteLine("----------------MENÚ DE SELECCIÓN----------------" + "\n \n" +
                "1. Crea una matriz con el tamaño seleccionado\n" +
                "2. Muestra la matriz\n" +
                "3. Modifica los datos de la matriz\n" +
                "4. Salida del programa \n \n" +
                "Selecciona la opción que desees:");

                seleccion = Int32.Parse(Console.ReadLine());        //Variable con la que podremos introducir la opción deseada del menú de selección



                switch (seleccion)             /*Ponemos una estructura múltiple switch para diferenciar las distintas opciones que se nos presentan y 
                                               poder así escoger fácilmente mediante los números de los distintos cases*/
                {
                    //Dentro de cada case hemos insertado las funciones que más adelante se detallarán, fuera del Main
                    case 1:
                        CreatuMatriz(filas, columnas, matriz1);      //Función para crear la matriz. En ella insertaremos los números que queramos
                        break;                                       //En todos los casos, el break se exige para finalizar, en este caso, la ejecución de las distintas funciones

                    case 2:
                        ImprimeMatriz(filas, columnas, matriz1);      //Con esta función imprimiremos en pantalla la matriz que hayamos creado con la anterior función
                        break;

                    case 3:
                        ModificaMatriz(filas, columnas, matriz1);       //Con esta función podremos modificar los valores introducidos para crear la matriz en la primera función
                        break;

                    case 4:
                        Console.WriteLine("\nFin del programa");   //Si seleccionamos el case 4 finalizaremos la ejecución del programa
                        Console.ReadKey();
                        break;



                }

                if (seleccion < 1 || seleccion > 4)     //Como tenemos 4 cases, si introducimos un valor por debajo o por encima de esos cases nos saltará un mensaje de error
                {
                    Console.WriteLine("\nHas introducido una opción errónea.\nPresiona una tecla para volver a introducir una opción válida entre 1 y 4");
                    Console.ReadKey();
                }
                Console.Clear();    //Con este console.clear limpiaremos la pantalla para volver al menú y poder introducir un valor correcto en el menú

            }

            while (seleccion >= 1 && seleccion <= 3 || seleccion < 1 || seleccion > 4);  /*Ejecutaremos lo que haya en el do mientras la opción escogida esté comprendida entre y 3, 
                                                                                         pero también si escogemos erróneamente por debajo de 1 y por encima de 4 para que 
                                                                                         se nos brinde la oportunidad de volver a introducir un valor de selección*/

        }

        static void CreatuMatriz(int x, int y, int[,] vector)    /*Primera función fuera del Main. Le pasamos las variables para pasarlas con los valores 
                                                                 filas, columnas y el array de la matriz*/
        {

            Console.Clear();

            Console.WriteLine("Con los valores de filas y columnas, [" + x + "," + y + "], deberás introducir " + (x * y) + " números en la matriz. " +
                              "Empieza a introducir los números uno a uno para ser insertados en sus respectivas posiciones. Pulsa una tecla para empezar:\n");

            Console.ReadKey();         /*Le recordamos al usuario los datos introducidos cuando ha determinado el tamaño de la matriz, e informamos de que se 
                                       introduzcan los números necesarios para acabar de terminar la matriz*/

            int contador = 1;   //Ponemos una variable que luego nos servirá a cada vuelta que hagamos en los bucles for


            for (int i = 0; i < x; i++)         //Creamos un bucle for para que recorra cada una de las posiciones de las filas
            {

                for (int j = 0; j < y; j++)       //Creamos otro bucle for para que recorra cada una de las posiciones de las columnas
                {

                    Console.WriteLine($"Numero " + contador);   /*Por cada valor que recorra de la matriz, imprimiremos para informar al usuario del número que 
                                                                tiene que introducir. Enumeraremos cada valor para su posterior definición*/

                    vector[i, j] = Int32.Parse((Console.ReadLine() + " "));   /*Por cada valor que recorra, pediremos por consola al usuario que introduzca 
                                                                              el número que desee para cada posición de la matriz*/

                    contador++;      //Por cada posición que recorra la variable contador aumentará en uno para enumerar los distintos valores a introducir por el usuario

                }

            }

            Console.WriteLine("\nPulsa una tecla para finalizar la creación de la matriz y volver al menú");  /*Una vez finalizada la creación de la matriz, 
                                                                                                              volveremos al menú de selección*/
            Console.ReadKey();
            Console.Clear();
        }

        static void ImprimeMatriz(int x, int y, int[,] vector)         /*La segunda función fuera del Main nos servirá para imprimir la matriz 
                                                                       que hayamos creado con la función CreatuMatriz*/
        {
            Console.Clear();

            Console.Write("--------------IMPRESIÓN DE LA MATRIZ--------------\n\n");

            for (int i = 0; i < x; i++)      //Recorremos cada una de las posiciones de las filas
            {
                for (int j = 0; j < y; j++)   //Recorremos cada una de las posiciones de las columnas con un bucle for anidado dentro del anterior para las filas
                {

                    Console.Write((vector[i, j]) + " ");   /*Por cada posición que recorra del array de filas y columnas, imprimiremos el valor 
                                                           que corresponda con un espacio para airear los datos*/
                }

                Console.Write("\n");      //Daremos un salto de línea cuando hayamos recorrido la primera línea de la matriz, y así sucesivamente.

            }
            Console.WriteLine("\nPulsa una tecla para volver al menú");   //Una vez imprimida la matriz, volvemos al menú de selección
            Console.ReadKey();
            Console.Clear();

        }

        static void ModificaMatriz(int x, int y, int[,] vector)   //Con la tercera función fuera del Main modificaremos una de las posiciones de la matriz
        {

            int posfilas, poscolumnas;  //Declaramos dos variables para seleccionar la posición de las filas y la de las columnas que queramos modificar

            Console.Clear();

            Console.WriteLine("--------------MATRIZ CREADA IMPRESA--------------\n");

            for (int i = 0; i < x; i++)
            {
                for (int j = 0; j < y; j++)
                {

                    Console.Write((vector[i, j]) + " ");    //Imprimimos de nuevo la matriz creada para que el usuario tenga una referencia visual de los datos introducidos

                }

                Console.Write("\n");

            }

            Console.WriteLine();   //Hacemos un salto de línea para espaciar los contenidos

            do      //Hacemos un bucle do...while para recorrer el código mientras no se cumplan unos requisitos establecidos
            {

                Console.WriteLine("Selecciona la posición de la fila que desees modificar en la matriz:");
                posfilas = Int32.Parse(Console.ReadLine());

                Console.WriteLine("Selecciona la posición de la columna que desees modificar en la matriz:");
                poscolumnas = Int32.Parse(Console.ReadLine());

                if (posfilas > x || poscolumnas > y)      /*Si introducimos un valor por encima del número de filas o de columnas nos saltará un mensaje de error, y como estamos 
                                                          dentro del bucle se nos invitará a introducir de nuevo dicho dato*/
                {
                    Console.WriteLine("Has insertado unos valores fuera de rango.\nInserta unos nuevos valores.");
                    Console.ReadKey();
                    Console.Clear();
                }

            }

            while (posfilas > x || poscolumnas > y);   /*Los requisitos para dejar de recorrer el bucle son que las posiciones introducidas 
                                                       no sean superiores a las establecidas porque si no se saldría del rango de la matriz*/

            if (posfilas < x && poscolumnas < y)      //Si introducimos correctamente las posiciones de la matriz podremos avanzar en la ejecución del programa
            {

                Console.Clear();

                Console.WriteLine("--------------MATRIZ MODIFICADA DEFINITIVA--------------\n\nCon la posición seleccionada a " +
                    "modificar" + "[" + posfilas + "," + poscolumnas + "] la matriz quedará así.\nEsta es tu primera matriz:\n");

                for (int i = 0; i < x; i++)
                {
                    for (int j = 0; j < y; j++)
                    {

                        Console.Write((vector[i, j]) + " ");   /*Imprimimos de nuevo la matriz para que el usuario tenga la referencia de 
                                                               como era la matriz original creada anteriormente*/
                    }

                    Console.Write("\n");

                }

                Console.WriteLine();    //Hacemos un salto de línea para separar contenidos

                Console.WriteLine("Y así queda tu matriz modificada:\n");

                vector[posfilas, poscolumnas] = 0;   //El valor que hayamos definido para su modificación en la matriz pasará a ser cero

                for (int i = 0; i < x; i++)
                {
                    for (int j = 0; j < y; j++)
                    {

                        Console.Write(vector[i, j] + " ");    //Imprimos el estado final de como queda la matriz modificada 
                    }

                    Console.Write("\n");

                }

                Console.WriteLine("\nPulsa una tecla para volver al menú");   /*Volvemos al menú por si queremos seguir haciendo pruebas, 
                                                                              visualizar de nuevo la matriz, o simplemente salir del programa*/
                Console.ReadKey();

                Console.Clear();
            }
        }
    }
}
