import java.util.Scanner;

public class Ejercicio1 {
    /*
    Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado:
        Hora
        Minutos
        Segundos
        Cantidad de segundos a incrementar
    La aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce hora=13, minutos=59 y segundos=51,
    y se desea incrementar en 10 segundos, el resultado a mostrar es 14:00:01.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int horas, minutos, segundos; //Variables donde vamos a guardar los datos introducidos por el usuario
        int incrementoSegundos;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca la hora del día y guardamos las respuestas en las variables declaradas
        //previamente
        System.out.println("Introduzca la hora del día (solo la hora): ");
        horas = sc.nextInt();
        System.out.println("Introduzca ahora los minutos: ");
        minutos = sc.nextInt();
        System.out.println("Introduzca los segundos (hay que ser precisos): ");
        segundos = sc.nextInt();
        System.out.println("Introduzca en cuantos segundos quiere incrementar la hora");
        incrementoSegundos = sc.nextInt();


        if (horas >= 0 && horas <= 23               //Si las horas están en el rango 0-23,
                && minutos >= 0 && minutos <= 59    //y los minutos y segundo en el rango 0-59
                && segundos >= 0 && segundos <= 59) {

            for (int i = 1; i <= incrementoSegundos; i++) { //Incrementamos la hora en 1 segundo cuantas veces me indique el usuario cuando le preguntamos el incremento

                if (segundos == 59) {           //Si los segundos son iguales a 59
                    segundos = 0;               //Igualamos los segundos a 0
                    if (minutos == 59) {        //Si los minutos son iguales a 59
                        minutos = 0;            //Igulamos los minutos a 0
                        if (horas == 23) {      //Si las horas son iguales a 23
                            horas = 0;          //Igualamos las horas a 0
                        } else {                //Si las horas no son iguales a 23
                            horas++;            //incrementamos las horas en 1
                        }
                    } else {                    //Si los minutos no son iguales a 59
                        minutos++;              //Incrementamos los minutos en 1
                    }
                } else {                        //Si los segundos no son igualae a 59
                    segundos++;                 //Incrementamos los segundos en 1
                }

            }
            //Una vez que salgamos del bucle for imprimimos por pantalla las horas, minutos y segundos tras el incremento
            System.out.println(String.format("%d:%d:%d", horas, minutos, segundos));

        } else { //Si los valores introducidos no se encuentran en los rangos especificados, imprimimos un mensaje de error
            System.out.println("Valores introducidos no válidos");
        }

        //Cerramos el scanner
        sc.close();
    }
}
