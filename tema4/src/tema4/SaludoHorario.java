package tema4;

import java.util.Scanner;

public class SaludoHorario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String saludo;
        String colorCode;

        // Códigos ANSI para color y formato
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BOLD = "\u001B[1m";

        System.out.println("--- Saludo Horario ---");
        System.out.print("Introduce la hora actual (formato 24h, solo la hora): ");
        int hora = entrada.nextInt();

        // Uso de if-else-if encadenado [cite: 93]
        if (hora >= 6 && hora <= 12) { // 6 a 12 [cite: 10]
            saludo = "Buenos días";
            colorCode = ANSI_RED; // ROJO [cite: 10]
        } else if (hora >= 13 && hora <= 20) { // 13 a 20 [cite: 10]
            saludo = "Buenas tardes";
            colorCode = ANSI_BLUE; // AZUL [cite: 10]
        } else { // 21 a 5 (incluye 21, 22, 23, 0, 1, 2, 3, 4, 5) [cite: 10]
            saludo = "Buenas noches";
            colorCode = ANSI_GREEN; // VERDE [cite: 10]
        }

        // Imprimir el saludo formateado: COLOR + NEGRITA + Mensaje + RESET
        // El salto de línea (%n) también podría usarse aquí con printf [cite: 70, 80]
        System.out.printf("%s%s%s%n", ANSI_BOLD + colorCode, saludo, ANSI_RESET);
        
        entrada.close();
    }
}