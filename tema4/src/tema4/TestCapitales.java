package tema4;

import java.util.Scanner;

public class TestCapitales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int puntuacion = 0;
        
        System.out.println("--- Test de Capitales del Mundo ---");

        // Pregunta 1
        System.out.print("¿Cuál es la capital de España?: ");
        String resp1 = entrada.nextLine(); // Lee texto [cite: 57]
        if (resp1.equalsIgnoreCase("Madrid")) { // Compara la respuesta
            puntuacion++;
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta es Madrid.");
        }

        // Pregunta 2
        System.out.print("¿Cuál es la capital de Italia?: ");
        String resp2 = entrada.nextLine();
        if (resp2.equalsIgnoreCase("Roma")) {
            puntuacion++;
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta es Roma.");
        }

        // Pregunta 3
        System.out.print("¿Cuál es la capital de Japón?: ");
        String resp3 = entrada.nextLine();
        if (resp3.equalsIgnoreCase("Tokio")) {
            puntuacion++;
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta es Tokio.");
        }

        System.out.println("\nHas obtenido " + puntuacion + " puntos.");
        
        entrada.close();
    }
}