package ejercicios;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular el área de un cuadrado");
        System.out.println("2. Calcular el área de un triángulo");
        System.out.println("3. Calcular el área de un rectángulo");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }

    public static void obtenerAreaCuadrado() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();

        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area); 
    }
    
}
