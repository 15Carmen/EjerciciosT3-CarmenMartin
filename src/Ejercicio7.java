import java.util.Scanner;

public class Ejercicio7 {
    /*
        Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:
        1
        121
        12321
        1234321
         */
    public static void main(String[] args) {
        //Daclaramos las variables
        int num;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un valor y lo almacenamos en la variable num
        System.out.println("Introduzca un número entero positivo: ");
        num = sc.nextInt();


        if (num <= 0) {     //Si"El número debe ser mayor que 0 el numero es menor o igual a 0, imprimimos un mensaje de error
            System.out.print("Valor introducido no valido, el numero debe ser positivo");
        } else {            //Si el numero introducido es positivo

            for (int i = 1; i <= num; i++) {        //Inicializamos el primer bucle en 1, lo terminamos en num y lo incrementamos en 1

                for (int j = 1; j <= i; j++) {      //Inicializamos el segundo bucle en 1, lo terminamos en i y lo incrementamos en 1
                    System.out.print(j);            //Imprimimos j
                }

                for (int k = i - 1; k >= 1; k--) {  //Inicializamos el segundo bucle en i-1, lo terminamos en 1 y lo decrementamos en 1
                    System.out.print(k);            //Imprimimos k
                }

                System.out.println();               //Hacemos un salto de linea
            }
        }
        //Cerramos el scanner
        sc.close();
    }

}

