import java.util.Scanner;

public class Ejercicio9 {
    /*
    Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. El número introducido
    debe ser mayor que 0.

    --Pruebas--
            [1] Introducir un numero menor o igual que 0 y que imprima el mensaje de error configurado
            num=0 -> RE: "Numero no válido, debe ser mayor que 0"
                  -> RO: "Numero no válido, debe ser mayor que 0"

            [2] Introducir un numero menor que 10 y que imprima que el numero tiene 1 cifra
            num=5 -> RE: El numero tiene 1 cifras
                  -> RO: El numero tiene 1 cifras

            [3] Introducir un numero cualquiera y que imprima el numero de cifras que tiene
            num=1234567 -> RE: El numero tiene 7 cifras
                        -> RO: El numero tiene 7 cifras

            [4] Introducir un numero de 20 cifras o más y que el programa de un error porque no soporta una cifra tan grande
            num=1234567890 -> RE: Exception in thread "main" java.util.InputMismatchException: For input string: "12345678901234567890"
                           -> RO: Exception in thread "main" java.util.InputMismatchException: For input string: "12345678901234567890"

     */
    public static void main(String[] args) {

        //Declaramos las variables
        long num;
        int contadorCifras=0;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero entero y lo guardamos en la variable num
        System.out.println("Introduzca un numero entero: ");
        num= sc.nextLong();

        if (num<=0){                 //Si el numero introducido es menor que 0 imprimimos un mensaje de error
            System.out.println("Numero no válido, debe ser mayor que 0");
        }else{                      //Si no lo es
            while (num>0){          //Mientras el numero introducido sea mayor que 0
                num/=10;            //vamos dividiendo el numero entre 10
                contadorCifras++;   //y añadiendole 1 al contador de cifras
            }

            //Cuando salgamos del bucle escribimos el resultado por pantalla
            System.out.println("El numero tiene " + contadorCifras + " cifras");
        }

        //Cerramos el scanner
        sc.close();


    }
}
