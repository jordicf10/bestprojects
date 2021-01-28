using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EJERCICIO_CIFRADO
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("----------------ENCRIPTADO CÉSAR----------------\n\n");

            Console.WriteLine("Introduce el texto o palabra que desees cifrar:");  //Inicializamos la variable cadena introduciendo el texto que queramos
            string cadena = Console.ReadLine();

            Console.WriteLine("Introduce el desplazamiento que quieras para el cifrado:");  //Inicializamos la variable desplazamiento introduciendo la cifra que queramos
            int desplazamiento = Int32.Parse(Console.ReadLine());

            int opcion = 0;   //Declaramos la variable dándole un valor 0 para que sea visible dentro del switch

            do
            {
                Console.WriteLine("\n\n----------------BIENVENIDO AL CIFRADO CÉSAR----------------\n\n1. Encripta el texto que has escrito\n2. Sal del programa");

                opcion = Int32.Parse(Console.ReadLine());

                switch (opcion)   //Ponemos una estructura múltiple switch para elegir entre distintas opciones
                {
                    case 1:

                        MetodoCesar(cadena, desplazamiento);  //Llamamos al método para ejecutar su código                                          
                        Console.ReadKey();
                        break;

                    case 2:

                        Console.WriteLine("Fin del programa");   //Si elegimos esta opción saldremos del programa
                        Console.ReadKey();
                        break;
                }
                if (opcion < 1 || opcion > 2)     //Como tenemos 2 cases, si introducimos un valor por debajo o por encima de esos cases nos saltará un mensaje de error
                {
                    Console.WriteLine("\nHas introducido una opción errónea.\nPresiona una tecla para volver a introducir una opción válida entre 1 y 2");
                    Console.ReadKey();
                }
                Console.Clear();
            }

            while (opcion == 1 && opcion == 2 || opcion < 1 || opcion > 2);            

        }
        static void MetodoCesar(string texto, int movimiento)  // Declaramos el método
        {
            
            char[] letrasindividuales = texto.ToCharArray();    //Creamos un array para dividir el texto en caracteres y así pasar el string a char
            int[] uniletras = new int[letrasindividuales.Length];   //Creamos un array para insertar los caracteres Char y así pasarlos a enteros
            int[] unicesarletras = new int[letrasindividuales.Length];  //Creamos un array para insertar el anterior array y así poder manipular los datos a posteriori

            for (int i = 0; i < letrasindividuales.Length; i++)           //Recorremos el array con un bucle for para determinar que hacemos con cada posición del texto
            {
                uniletras[i] = (int)letrasindividuales[i];    //Le decimos que cada caracter del array de enteros equivale a un char pasado a entero
            }

            for (int i = 0; i < letrasindividuales.Length; i++)
            {
                if (uniletras[i] >= 65 && uniletras[i] <= 90)          /*Si se cumple la condición de que los caracteres introducidos están en mayúsculas
                                                                       (según la correspondencia en la tabla ASCII)*/
                {
                   unicesarletras[i] = ((char)(uniletras[i] + (char)movimiento - 65) % 26 + 65);       /*Con esta operación matemática haremos que los caracteres no se 
                                                                                                      salgan de los caracteres en mayúscula. Al recorrer el abecedario en mayúsculas
                                                                                                      y llegar a la letra "Z" volverá a la letra "A", y así sucesivamente.  */
                }

                if ((uniletras[i] >= 96 && uniletras[i] <= 122))                  /*Si se cumple la condición de que los caracteres introducidos en minúsculas
                                                                                  (según la correspondencia en la tabla ASCII)*/
                {
                    if ((uniletras[i] + movimiento) > 122)                         //Si dentro de las minúsculas, nos pasamos del abecesario en minúsculas
                        unicesarletras[i] = (((uniletras[i] + movimiento) - 97) % 26 + 97);  //ejecutaremos esta operación matemática que hara que al recorrer el abecedario en mayúsculas
                                                                                             //y llegar a la letra "Z" volverá a la letra "A", y así sucesivamente

                    else         // Si no se cumple la condición, imprimiremos el valor de la letra más el valor de desplazamiento que hayamos introducido
                    {
                        unicesarletras[i] = (uniletras[i] + movimiento);
                    }

                }
            }

            char[] cesardefinitivo = new char[letrasindividuales.Length]; 
                                                                                //Para recopilar todos los caracteres alterados crearemos un array de caracteres char
            for (int i = 0; i < letrasindividuales.Length; i++)                 //Recorreremos el texto caracter por caracter para ejecutar el código 
            {
                Console.Write(cesardefinitivo[i] = (char)unicesarletras[i]);            //En el array de char creado insertaremos todos los caracteres caracteres pasados a char
            }                                                                                                                                     
        }     
    }
}
        
    

