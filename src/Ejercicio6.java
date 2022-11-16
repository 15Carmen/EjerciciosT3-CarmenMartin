import java.util.Scanner;

public class Ejercicio6 {
    /*
    Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los números desde 1
    hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor. Ejemplo:
    1
    22
    333
    4444
    55555

    --Pruebas--
            [1] Introducir un numero menor que 0 y que imprima el mensaje de error configurado
            numFilas=0 -> RE: "Error, valor introducido no valido, debe ser mayor que 0"
                       -> RO: "Error, valor introducido no valido, debe ser mayor que 0"

            [2] Introducir un 1 y que imprima solo la primera fila
            numFilas=1 -> RE: 1
                       -> RO: 1
            [3] Introducir un numero positivo cualquiera y que imprima correctamente la pirámide
            numFilas=5 -> RE: 1
                              22
                              333
                              4444
                              55555
                          RO: 1
                              22
                              333
                              4444
                              55555
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int numFilas;

        //Declaramos el scanner para poder leer por teclado
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca el numero de filas que va a tener el triangulo y lo guardamos en la variable numFilas
        System.out.println("Introduce el número de niveles que tendrá la pirámide: ");
        numFilas = sc.nextInt();

        if (numFilas<=0){                           //Si el numero introducido es menor o igual a 0 lanzamos un mensaje de error
            System.out.println("Error, valor introducido no valido, debe ser mayor que 0");
        }else{
            for (int i = 1; i <= numFilas; i++) {   //Inicializamos el primer bucle en 1, lo terminamos en numFilas y lo incrementamos en 1
                for (int j = 1; j <= i; j++) {      //Inicializamos el segundo bucle en 1, lo terminamos en i y lo incrementamos en 1
                    System.out.print(i);            //Imprimimos i
                }
                System.out.println();               //Hacemos un salto de linea
            }
        }


        //Cerramos el scanner
        sc.close();
    }
}
