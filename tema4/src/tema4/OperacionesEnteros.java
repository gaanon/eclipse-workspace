package tema4;

import java.util.Scanner;

public class OperacionesEnteros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Multiplicación de Enteros ---");
        
        System.out.print("Introduce el primer número entero: ");
        int num1 = entrada.nextInt(); // Lee el primer entero [cite: 57]
        
        System.out.print("Introduce el segundo número entero: ");
        int num2 = entrada.nextInt(); // Lee el segundo entero [cite: 57]
        
        int resultado = num1 * num2;
        
        System.out.println("El resultado de la multiplicación es: " + resultado);
        
        entrada.close(); // Liberar recursos [cite: 58]
    }
}