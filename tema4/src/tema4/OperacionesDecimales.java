package tema4;

import java.util.Scanner;

public class OperacionesDecimales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- Operaciones con Decimales ---");
        
        System.out.print("Introduce el primer número decimal: ");
        double num1 = entrada.nextDouble(); // Lee el primer decimal [cite: 57]
        
        System.out.print("Introduce el segundo número decimal: ");
        double num2 = entrada.nextDouble(); // Lee el segundo decimal [cite: 57]
        
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        // Se añade un chequeo simple para evitar división por cero.
        if (num2 != 0) {
            System.out.println("División: " + (num1 / num2));
        } else {
            System.out.println("División: ERROR (División por cero)");
        }
        
        entrada.close();
    }
}