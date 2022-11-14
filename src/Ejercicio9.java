import java.util.Scanner;

public class Ejercicio9 {
    /*
    Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. El número introducido
    debe ser mayor que 0.
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
