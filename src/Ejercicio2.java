import java.util.Scanner;

public class Ejercicio2 {
    /*
    Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.

    --Pruebas--

        [1] Introducir un numero menor o igual que 0 y que salga el mensaje de error configurado
                numMAx=0 ->  Resultado Esperado (RE): "Valores introducidos no válidos".
                         ->  Resultado Obtenido (RO): "Valores introducidos no válidos"
                numMAx=-5 ->  Resultado Esperado (RE): "Valores introducidos no válidos".
                          ->  Resultado Obtenido (RO): "Valores introducidos no válidos"

        [2] Introducir un numero mayor que 0
                numMAx=20 -> Resultado Esperado (RE): "En el rango 1 a 20, hay 8 numeros primos"
                         ->  Resultado Obtenido (RO): "En el rango 1 a 20, hay 8 numeros primos"

        [2] Introducir un 1 y que aparezca que no hay numeros primos
                numMAx=1 -> Resultado Esperado (RE): "En el rango 1 a 1, hay 0 numeros primos"
                         ->  Resultado Obtenido (RO): "En el rango 1 a 1, hay 0 numeros primos"

     */
    public static void main(String[] args) {
        //Declaramos las variables
        int numMax;    //Varaible donde vamos a guardar el numero introducido por el usuario
        int contadorPrimos = 0;     //Variable contador donde vamso a guaardar cuantos numeros primos hay


        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero entero positivo y lo guardamos en la variable numMax
        System.out.println("Introduzca un numero entero positivo: ");
        numMax = sc.nextInt();

        if (numMax <= 0) { //Si el numero introducido no es positivo lanzamos un mensaje de error
            System.out.println("Numero no valido, debe ser positivo");

        } else {      //Si el numero entero es positivo
            for (int num = 2; num <= numMax; num++) {
                boolean primo = true;

                for (int divisor = 2; divisor < num; divisor++) {
                    if (num % divisor == 0){
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    contadorPrimos++; // si es primo incrementamos el contador de primos
                    System.out.println(num + (" es primo"));
                }
            }
            System.out.println("En el rango 1 a " + numMax + ", hay " + contadorPrimos + " numeros primos");
        }

    }
}

/*       ---OTRA FORMA DE REALIZARLO---

        //Declaramos las variables
        int numMax;    //Varaible donde vamos a guardar el numero introducido por el usuario
        int contadorPrimos = 0;


        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero entero positivo y lo guardamos en la variable previamente declarada
        System.out.println("Introduzca un numero entero positivo: ");
        numMax = sc.nextInt();

        if (numMax < 0) { //Si el numero introducido no es positivo lanzamos un mensaje de error
            System.out.println("Numero no valido, debe ser positivo");

        } else {      //Si el numero entero es positivo
            for (int num = 2; num <= numMax; num++) {
                contadorPrimos++;

                for (int divisor = 2; divisor < num; divisor++) {
                    if (num % divisor == 0){
                       contadorPrimos--;
                        break;
                    }
                }
            }
            System.out.println("En el rango 1 a " + numMax + ", hay " + contadorPrimos + " numeros primos");
        }
 */
