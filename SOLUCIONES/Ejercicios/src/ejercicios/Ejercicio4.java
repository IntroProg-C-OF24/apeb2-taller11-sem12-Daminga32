package ejercicios;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular el valor de la planilla de luz");
        System.out.println("2. Calcular el valor del predio de un bien inmueble");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la cédula del cliente:");
        String cedula = scanner.nextLine();

        switch (opcion) {
            case 1:
                calcularValorLuz(nombre, cedula);
                break;
            case 2:
                calcularPredio(nombre, cedula);
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }

    public static void calcularValorLuz(String nombre, String cedula) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del kilowatio:");
        double valorKilowatio = scanner.nextDouble();

        System.out.println("Ingrese el número de kilowatios del mes:");
        double kilowatios = scanner.nextDouble();

        double valorPlanilla = valorKilowatio * kilowatios;

        System.out.println("Cliente " + nombre + " con cédula " + cedula +
                " debe cancelar el valor de $" + valorPlanilla + " por la planilla de luz.");
    }

    public static void calcularPredio(String nombre, String cedula) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del bien inmueble:");
        double valorInmueble = scanner.nextDouble();

        double valorPredio = 0.02 * valorInmueble;

        System.out.println("Cliente " + nombre + " con cédula " + cedula +
                " tiene un bien inmueble valorado en $" + valorInmueble +
                " y tiene que pagar de predio $" + valorPredio + ".");
    }
    
}
