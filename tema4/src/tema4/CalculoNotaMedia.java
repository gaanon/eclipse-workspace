package tema4;

import java.util.Scanner;

public class CalculoNotaMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Ponderaciones 
        final double PONDERACION_EXAMEN1 = 0.40; // 40%
        final double PONDERACION_EXAMEN2 = 0.60; // 60%
        
        System.out.println("--- TAREA 1: Cálculo de Nota Media ---");

        System.out.print("Nombre de la asignatura: ");
        String asignatura = entrada.nextLine();

        System.out.print("Nota del Primer Examen (sobre 100): "); // Notas parciales sobre 100 
        double nota1 = entrada.nextDouble();

        System.out.print("Nota Media deseada para el trimestre (sobre 10): "); // Nota final sobre 10 
        double mediaDeseada = entrada.nextDouble();
        
        // 1. Convertir la media deseada a la escala de 100 (para operar con nota1)
        double mediaDeseada_100 = mediaDeseada * 10;
        
        // 2. Calcular la contribución del primer examen
        double contribucion1 = nota1 * PONDERACION_EXAMEN1;
        
        // 3. Calcular la nota necesaria que debe aportar el segundo examen
        double contribucionNecesaria2 = mediaDeseada_100 - contribucion1;
        
        // 4. Despejar la nota (X) necesaria en el segundo examen: X * 0.60 = contribucionNecesaria2
        double notaRequerida2 = contribucionNecesaria2 / PONDERACION_EXAMEN2;
        
        System.out.println("\nAsignatura: " + asignatura);
        
        // Mostrar la nota requerida redondeada 
        System.out.printf("Necesitas obtener: %d puntos (sobre 100) en el Segundo Examen.%n",
                Math.round(notaRequerida2));


        if (notaRequerida2 > 100) {
            System.out.println("¡Es imposible alcanzar esa media! La nota requerida supera el 100%.");
        } else if (notaRequerida2 < 0) {
             System.out.println("¡La media deseada ya está superada! La nota requerida es 0 o menos.");
        }
        
        entrada.close();
    }
}