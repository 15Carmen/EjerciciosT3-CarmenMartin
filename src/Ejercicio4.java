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
        int mcd;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedios al usuario que introduzca dos numeros enteros y los guardamos en las variables declaradas anteriormente
        System.out.println("Introduzca un numero entero positivo: ");
        numA=sc.nextInt();
        System.out.println("Introduzca otro numero entero positivo: ");
        numB=sc.nextInt();

        if (numA<0 || numB <0){
            System.out.println("Te he dicho que tiene que ser positivo imbecil");
        }else{
            while (numA!=numB){
                if (numA>numB){
                    for (int i = numB; i <=1 ; i--) {
                        if (numA % i == 0 && numB % i == 0){
                            mcd = i;
                        }
                    }
                }else {

                }
            }

        }

    }
}
