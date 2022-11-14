import java.util.Scanner;

public class Ejercicio8 {
    /*
    Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de
    números finaliza con la introducción de un 0. Al final se mostrará:
    El total de números introducidos, excluido el 0.
    El total de números fallados.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int numInicial;
        int numMayor;
        int contadorNumeros = 0;
        int contadorFallos = 0;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero entero y lo guardamos en la variable numInicial
        System.out.println("Introduzca un numero entero: ");
        numInicial= sc.nextInt();
        numMayor=numInicial;                                //actualemte la variable mayor es la introducida inicialmente, así que decimos que numMayor es igual que numIncial

        while (numInicial!=0){                              //Mientras que numInicial sea distinto de 0
            contadorNumeros++;                              //añadimos 1 al contador de numeros

            if (numInicial<numMayor) {                      //Si el numero inicial es menor que el mayor introducido hasta el momento
                System.out.println("Fallo es menor.");      //Imprimimos un mensaje de error
                contadorFallos++;                           //Y sumamos 1 al contador de fallos
            }

            numMayor=numInicial;                            //Volvemos a igualar el numero mayor al inicial para no perder
                                                            //la variable mayor introducida hasta el momento,
            System.out.println("Introduzca un numero:");    //puesto que ahora vamos a pedir otro numero
            numInicial= sc.nextInt();                       //que guardaremos en la variable numeroInicial
        }

        //Cuando salga del bucle imprimimos el total de numeros introducidos y el total de fallados
        System.out.println("El total de numeros introducidos es: " + contadorNumeros);
        System.out.println("Numeros fallados: " + contadorFallos);

        //Cerramos el scanner
        sc.close();

    }
}
