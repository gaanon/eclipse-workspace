package tema4;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String animalAdivinado = "No se pudo adivinar el animal.";

        System.out.println("--- TAREA 2: Adivina el Animal ---");
        System.out.print("¿Tu animal vive en el agua? (S/N): ");
        String viveEnAgua = entrada.nextLine().toUpperCase();

        // Nivel 1: Agua o Tierra
        if (viveEnAgua.equals("S")) {
            System.out.print("¿Es un pez? (S/N): ");
            String esPez = entrada.nextLine().toUpperCase();
            
            // Nivel 2.1: Pez o Otro Acuático
            if (esPez.equals("S")) {
                animalAdivinado = "Pez";
            } else if (esPez.equals("N")) {
                animalAdivinado = "Delfín o Ballena";
            }
        } else if (viveEnAgua.equals("N")) {
            System.out.print("¿Es doméstico? (S/N): ");
            String esDomestico = entrada.nextLine().toUpperCase();
            
            // Nivel 2.2: Doméstico o Salvaje
            if (esDomestico.equals("S")) {
                System.out.print("¿Dice 'guau'? (S/N): ");
                String diceGuau = entrada.nextLine().toUpperCase();

                // Nivel 3.1: Perro o Gato
                if (diceGuau.equals("S")) {
                    animalAdivinado = "Perro";
                } else if (diceGuau.equals("N")) {
                    animalAdivinado = "Gato";
                }
            } else if (esDomestico.equals("N")) {
                animalAdivinado = "León o Tigre";
            }
        }
        
        System.out.println("\n¡Creo que tu animal es un: " + animalAdivinado + "!");
        
        entrada.close();
    }
}