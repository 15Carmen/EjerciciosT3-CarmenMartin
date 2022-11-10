import java.util.Scanner;

public class Ejercicio3 {
    /*
    Solicita al usuario un número n y dibuja un triángulo de base y altura n. Por ejemplo para n=4 debe dibujar lo siguiente:
           *
          * *
         * * *
        * * * *
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int num;    //Variable donde vamos a guardar el numero de filas y de asteriscos que va a tener el triángulo

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero para la base y la altura y lo guardamos en la variable num
        System.out.println("Introduzca el tamaño de la base y la altura: ");
        num = sc.nextInt();

        for(int altura = 1; altura<=num; altura++){                 //Inicializando el bucle en 1, lo terminamos en num y lo incrementamos en 1

            //Creamos un bucle para los espacios en blanco (ya que queremos que el rectángulo sea equilátero no rectángulo)
            for(int blancos = 1; blancos<=num-altura; blancos++){   //Inicializando el bucle en 1, lo terminamos en num-la altura y lo incrementamos en 1
                System.out.print(" ");                              //Imprimimos un espacio en blanco
            }

            //Creamos un bucle para los asteriscos
            for(int asteriscos=1; asteriscos<=altura; asteriscos++){    //Inicializando el bucle en 1, lo terminamos en nla altura y lo incrementamos en 1
                System.out.print("* ");                                 //Imprimimos un asterisco con un espacio a la derecha (para que me salga la pirámide equilátera)
            }
            System.out.println();                                       //Hacemos un salto de linea que me imprima la siguiente justo abajo de la que acabo de hacer
        }

        //Cerramos el scanner
        sc.close();
    }
}

