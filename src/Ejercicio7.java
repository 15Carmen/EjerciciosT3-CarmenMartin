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
        int numFilas;
        int numeroPosiciones;
        int posInicial;
        int posFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de niveles que tendrá la pirámide: ");
        numFilas = scanner.nextInt();

        numeroPosiciones = numFilas * 2 -1;
        posInicial = numFilas;
        posFinal = numFilas;

        for (int i = 0; i < numFilas; i++) {
            int contador = 1;
            String resultado = "";

            for (int j=0; j <= numeroPosiciones; j++) {
                if ((j < posInicial) || (j > posFinal)) {
                    resultado += " ";
                } else {
                    if (j < numFilas) {
                        resultado += contador;
                        contador++;
                    } else {
                        resultado += contador;
                        contador--;
                    }
                }
            }
            System.out.println(resultado);
            posFinal++;
            posInicial--;
        }
    }
}
