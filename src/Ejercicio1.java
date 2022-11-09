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


        //Cerramos el scanner
        sc.close();
    }
}
