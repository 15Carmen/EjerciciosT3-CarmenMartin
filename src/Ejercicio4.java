import java.util.Scanner;

public class Ejercicio4 {
    /*
    Para dos números dados, a y b, es posible calcular el máximo común divisor (el número más grande que divide a ambos)
    mediante un algoritmo ineficiente pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente, el
    primer número que divide a ambos simultáneamente. Teniendo en cuenta lo que se acaba de explicar, realiza un
    programa que calcule el máximo común divisor de dos números.
    */
    public static void main(String[] args) {

        //Declaramos las variables
        int numA, numB;
        int mcd = 1;
        int numMenor;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedios al usuario que introduzca dos numeros enteros y los guardamos en las variables declaradas anteriormente
        System.out.println("Introduzca un numero entero positivo: ");
        numA = sc.nextInt();
        System.out.println("Introduzca otro numero entero positivo: ");
        numB = sc.nextInt();

        if (numA == numB) {                  //Si los numeros introducidos son iguales lanzamos un mensaje de error
            System.out.println("Valores introducidos no válidos, los dos numeros son iguales");

        } else if (numA < 0 || numB < 0) {   //Si alguno de los numeros introducidos son negativos lanzamos un mensaje de error
            System.out.println("Valor introducido no valido, el numero debe ser positivo");

        } else {                            //Si los numeros introducidos no son negativos o iguales

            if (numA > numB){               //Si numA es menor que numB guardamos en numMenor el valor de numB
                numMenor = numB;
            } else {                        //Si no, guardamos en menor el valor de numA
                numMenor = numA;
            }
            /* Creamos un bucle for que recorra todos los números entre el menor de ambos números y 1
             * Para ello, creamos una variable contador 'i' inicializada a 1
             * El bucle se repetirá mientras el valor de 'i' sea menor o igual a 1
             * Tras cada vuelta, decrementamos el valor de 'i' en 1
             */
            for(int i = numMenor; i >= 1; i--){
                //Si 'a' y 'b' divididos por el valor actual de 'i' es igual a 0, ese valor es el MCD
                if (numA % i == 0 && numB % i == 0) {
                    //Guardamos el valor de i en la variable mcd
                    mcd = i;
                    //Como ya hemos encontrado el MCD, salimos del bucle for
                    break;
                }
            }

            //Imprimimos el resultado por consola
            System.out.printf("El MCD de %d y %d es: %d", numA, numB, mcd);
        }

        //Cerramos el scanner
        sc.close();

    }
}
    
    /*          ---OTRA FORMA MÁS EFICIENTE DE HACERLO---

        //Declaramos las variables
        int numA, numB;
        int mcd=1;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedios al usuario que introduzca dos numeros enteros y los guardamos en las variables declaradas anteriormente
        System.out.println("Introduzca un numero entero positivo: ");
        numA = sc.nextInt();
        System.out.println("Introduzca otro numero entero positivo: ");
        numB = sc.nextInt();

        if (numA == numB) {                  //Si los numeros introducidos son iguales lanzamos un mensaje de error
            System.out.println("Valores introducidos no válidos, los dos numeros son iguales");

        } else if (numA < 0 || numB < 0) {   //Si alguno de los numeros introducidos son negativos lanzamos un mensaje de error
            System.out.println("Valor introducido no valido, el numero debe ser positivo");

        } else {                             //Si los numeros introducidos no son negativos

            for (int i = 1; i <= numA && i <= numB; i++) {  //Inicializando el bucle en 1, lo terminamos en numA y numB y lo incrementamos en 1
                if (numA % i == 0 && numB % i == 0) {       //Si numA modulo de i es igual a 0 y numB modulo de i es igual a =
                    mcd = i;                                //El maximo comun divisor es la i
                }
            }

            //Imprimimos el resultado por consola
            System.out.printf("El MCD de %d y %d es: %d", numA, numB, mcd);
        }

        //Cerramos el scanner
        sc.close();
     */

