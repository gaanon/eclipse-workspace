package tema4;

import java.util.Scanner;

public class EvaluacionSigno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- Evaluación de Signo ---");
        System.out.print("Introduce un número entero: ");
        int num = entrada.nextInt(); // Lee el entero [cite: 57]
        
        // Uso de if-else [cite: 92]
        if (num > 0) { // Mayor que (>) [cite: 85]
            System.out.println("El número introducido es POSITIVO.");
        } else if (num < 0) { // Menor que (<) [cite: 85, 93]
            System.out.println("El número introducido es NEGATIVO.");
        } else {
            System.out.println("El número introducido es CERO (ni positivo ni negativo).");
        }
        
        entrada.close();
    }
}