import java.util.Scanner;

public class Ejercicio5 {
    /*
    De forma similar a la actividad 4, realiza un programa que calcule el mínimo común múltiplo de dos números dados.
    En este caso, habrá que partir del máximo de los dos e ir incrementando hasta encontrar el primer número que sea
    múltiplo de los dos números.

    --Pruebas--
            [1] Introducir dos numeros iguales y que imprima el mensaje de error configurado
            numA=2, numB=2 -> RE: "Valores introducidos no validos, los dos numeros son iguales"
                           -> RO: "Valores introducidos no validos, los dos numeros son iguales"

            [2] Introducir un numero menor que 0 y que imprima el mensaje de error configurado
            numA=0, numB=2 -> RE: "Valor introducido no valido, el numero debe ser positivo"
                           -> RO: "Valor introducido no valido, el numero debe ser positivo"
            numA=2, numB=0 -> RE: "Valor introducido no valido, el numero debe ser positivo"
                           -> RO: "Valor introducido no valido, el numero debe ser positivo"

            [3] Introducir dos numeros validos e imprimir el resultado
            numA=12, numB=12 -> RE: El mínimo común múltiplo es: 24
                             -> RO: El mínimo común múltiplo es: 24
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int numA, numB;
        int limite;
        int multiplo = 0;

        //Declaramos el scanner para poder leer por consola.
        Scanner sc = new Scanner(System.in);

        //Le pediremos al usuario que introduzca dos numeros enteros positivos y los guardaremos en las variables previamente declaradas.
        System.out.println("Introduzca un número entero positivo: ");
        numA = sc.nextInt();

        System.out.println("Introduzca otro número entero positivo: ");
        numB = sc.nextInt();

        if (numA == numB) {                  //Si los numeros introducidos son iguales lanzamos un mensaje de error
            System.out.println("Valores introducidos no validos, los dos numeros son iguales");

        }else if (numA > 0 && numB > 0) {    //Si ambos numeros introducidos son mayores que 0

            limite = numA * numB;            //Multiplicamos los números introducidos para que haga de límite.

            for (int i = 1; i <= limite; i++) {             //Inicializamos el bucle en 1, lo terminamos en el limite y lo incrementamos en 1
                if (i % numA == 0 && i % numB == 0) {       //Si i modulo de numA e i modulo de numB es 0
                    multiplo = i;                           //guardamos i en la variable multiplo
                    break;                                  //En cuanto esto suceda nos salimos del bucle.
                }
            }
            //Imprimimos el resultado por pantalla.
            System.out.println("El mínimo común múltiplo es: " + multiplo);

        } else {  //Si el numero introducido es menor que 0 imprimimos un mensaje de error
            System.out.println("Error, valores introducidos no validos");
        }

        //Cerramos el scanner.
        sc.close();

    }
}
