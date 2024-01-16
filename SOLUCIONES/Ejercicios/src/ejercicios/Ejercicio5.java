package ejercicios;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Ejemplo de uso de las funciones
        int suma = sumarMatriz(matriz);
        int resta = restarMatriz(matriz);
        int multiplicacion = multiplicarMatriz(matriz);

        // Mostrar resultados
        System.out.println("Suma de la matriz: " + suma);
        System.out.println("Resta de la matriz: " + resta);
        System.out.println("Multiplicación de la matriz: " + multiplicacion);
    }

    // Función para sumar los elementos de la matriz
    public static int sumarMatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }
        return suma;
    }

    // Función para restar los elementos de la matriz
    public static int restarMatriz(int[][] matriz) {
        int resta = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                resta -= elemento;
            }
        }
        return resta;
    }

    // Función para multiplicar los elementos de la matriz
    public static int multiplicarMatriz(int[][] matriz) {
        int multiplicacion = 1;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                multiplicacion *= elemento;
            }
        }
        return multiplicacion;
    }
}
