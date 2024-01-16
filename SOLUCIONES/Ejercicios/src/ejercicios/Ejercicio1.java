package ejercicios;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
       int[][] miArreglo = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        imprimirPares(miArreglo);
        imprimirImpares(miArreglo);
        imprimirPromedio(miArreglo);
    }

    // Método para imprimir los valores pares
    public static void imprimirPares(int[][] arreglo) {
        System.out.println("Valores Pares:");
        for (int[] fila : arreglo) {
            for (int elemento : fila) {
                if (elemento % 2 == 0) {
                    System.out.print(elemento + " ");
                }
            }
        }
        System.out.println();
    }

    // Método para imprimir los valores impares
    public static void imprimirImpares(int[][] arreglo) {
        System.out.println("Valores Impares:");
        for (int[] fila : arreglo) {
            for (int elemento : fila) {
                if (elemento % 2 != 0) {
                    System.out.print(elemento + " ");
                }
            }
        }
        System.out.println();
    }

    // Método para imprimir el promedio de todos los valores
    public static void imprimirPromedio(int[][] arreglo) {
        System.out.println("Promedio de todos los valores:");
        int sum = 0;
        int count = 0;
        for (int[] fila : arreglo) {
            for (int elemento : fila) {
                sum += elemento;
                count++;
            }
        }
        double promedio = (double) sum / count;
        System.out.println(promedio); 
    }
    
}
