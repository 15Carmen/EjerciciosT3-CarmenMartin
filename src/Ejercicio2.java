import java.util.Scanner;

public class Ejercicio2 {
    /*
    Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int num;    //Varaible donde vamos a guardar el numero introducido por el usuario
        int contadorPrimos = 0;


        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero entero positivo y lo guardamos en la variable previamente declarada
        System.out.println("Introduzca un numero entero positivo: ");
        num = sc.nextInt();

        if (num < 0) { //Si el numero introducido no es positivo lanzamos un mensaje de error
            System.out.println("Numero no valido, debe ser positivo");

        } else {      //Si el numero entero es positivo
            for (int i = 1; i <= num; i++) {

                boolean primo = true;
                int j = 2;

                while (j <= i - 1 && primo == true) {
                    if (i % j == 0){
                        primo = false;
                    }
                    j++;
                }

                if (primo == true) {
                    contadorPrimos++; // si es primo incrementamos el contador de primos
                    System.out.println(i + (" es primo"));
                }
            }
            System.out.println("En el rango 1 a " + num + ", hay " + contadorPrimos + " numeros primos");
        }

    }
}
