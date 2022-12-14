import java.util.Scanner;

public class Ejercicio10 {
    /*
    Realiza un programa que nos diga si un número introducido por teclado es capicúa o no.

    --Pruebas--
            [1] Introducir un numero menor o igual que 0 y que imprima el mensaje de error configurado
            num=0 -> RE: "Valor introducido no valido"
                  -> RO: "Valor introducido no valido"

            [2] Introducir un numero menor que 10 y que imprima que es capicua
            num=5 -> RE: Es capicua
                  -> RO: Es capìcua

            [3] Introducir un numero cualquiera y que imprima el resultado
            num=131 -> RE: Es capicua
                    -> RO: Es capìcua
            num=12323 -> RE: No es capicua
                      -> RO: No es capicua

     */
    public static void main(String[] args) {

        //Declaramos variables.
        int num;
        int aux;
        int inverso = 0;
        int unidad;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pediremos al usuario que introduzca un numero entero y los guardaremos en la variable num.
        System.out.println("Introduzca un numero: ");
        num = sc.nextInt();

        if (num<=0){                //Si el numero introducido es menor o igual que 0 imprimimos un mensaje de error
            System.out.println("Valor introducido no valido");
        }else if (num < 10) {       //Si el numero introducido es menor que 10
            System.out.println("Es capicua");  //Imprimimos que es capicua

        } else {                //Si el numero es menor que 10
            aux = num;          //Utilizamos la variable aux para no perder el valor original de num

            while (aux != 0) {                   //Mientras aux sea distinto de 0.
                unidad = aux % 10;               //Guardamos en la variable unidad el ultimo digito del numero auxiliar (esto lo hacemos gracias a hacer aux modulo de 10)
                inverso = inverso * 10 + unidad; //Inverso es igual a su valor actual por 10 más la unidad (que acabamos de calcular)
                aux = aux / 10;                  //Le quitamos la última cifra a aux.
            }

            if (num == inverso) {   //Si el numero introducido y su inverso son iguales imprimimos que es capicua
                System.out.println("Es capicua");

            } else {                //Si no son iguales imprimimos que no es capicua
                System.out.println("No es capicua");
            }
        }
        //Cerramos el scanner.
        sc.close();

    }
}

