package ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
        public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor decimal:");
        double valor1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo valor decimal:");
        double valor2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer valor decimal:");
        double valor3 = scanner.nextDouble();

        System.out.println("Ingrese el cuarto valor decimal:");
        double valor4 = scanner.nextDouble();

        double promedio = calcularPromedio(valor1, valor2, valor3, valor4);

        System.out.println("El promedio cualitativo es: " + obtenerPromedioCualitativo(promedio));

        scanner.close();
    }

    public static double calcularPromedio(double v1, double v2, double v3, double v4) {
        return (v1 + v2 + v3 + v4) / 4;
    }

    public static String obtenerPromedioCualitativo(double promedio) {
        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Fuera de rango";
        }
    }
}
