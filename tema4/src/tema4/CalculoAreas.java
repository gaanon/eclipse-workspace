package tema4;

import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double area = 0.0;
        
        System.out.println("--- TAREA 3: Cálculo de Áreas ---");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.print("Selecciona una opción (1-3): ");
        int opcion = entrada.nextInt();

        // Uso de switch para el menú [cite: 96]
        switch (opcion) {
            case 1: // Cuadrado [cite: 28]
                System.out.print("Introduce el lado: ");
                double lado = entrada.nextDouble();
                area = lado * lado;
                System.out.print("Área del Cuadrado: ");
                break;
            case 2: // Rectángulo [cite: 28]
                System.out.print("Introduce la base: ");
                double baseR = entrada.nextDouble();
                System.out.print("Introduce la altura: ");
                double alturaR = entrada.nextDouble();
                area = baseR * alturaR;
                System.out.print("Área del Rectángulo: ");
                break;
            case 3: // Triángulo [cite: 28]
                System.out.print("Introduce la base: ");
                double baseT = entrada.nextDouble();
                System.out.print("Introduce la altura: ");
                double alturaT = entrada.nextDouble();
                area = (baseT * alturaT) / 2;
                System.out.print("Área del Triángulo: ");
                break;
            default: // Valor por defecto si no coincide con los casos [cite: 97]
                System.out.println("Opción no válida.");
        }
        
        // Se imprime el resultado solo si la opción fue válida
        if (opcion >= 1 && opcion <= 3) {
            System.out.printf("%.2f unidades cuadradas.%n", area); // Formateo a 2 decimales [cite: 74]
        }
        
        entrada.close();
    }
}