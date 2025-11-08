package tema4;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PAGO_ORDINARIO = 12.0;
        final double PAGO_EXTRA = 16.0;
        final int HORAS_MAX_ORDINARIAS = 40;
        double salario;

        System.out.println("--- Cálculo de Salario Semanal ---");
        System.out.print("Introduce el total de horas trabajadas en la semana: ");
        int horasTrabajadas = entrada.nextInt();

        if (horasTrabajadas <= HORAS_MAX_ORDINARIAS) {
            // Caso 1: Solo horas ordinarias
            salario = horasTrabajadas * PAGO_ORDINARIO;
            System.out.println("Horas Ordinarias: " + horasTrabajadas);
            System.out.println("Horas Extraordinarias: 0");
        } else {
            // Caso 2: Horas ordinarias + extraordinarias
            int horasOrdinarias = HORAS_MAX_ORDINARIAS;
            // Las horas extraordinarias no necesitan ser completas [cite: 12]
            int horasExtraordinarias = horasTrabajadas - HORAS_MAX_ORDINARIAS; 
            
            double salarioOrdinario = horasOrdinarias * PAGO_ORDINARIO;
            double salarioExtra = horasExtraordinarias * PAGO_EXTRA;
            
            salario = salarioOrdinario + salarioExtra;

            System.out.println("Horas Ordinarias: " + horasOrdinarias);
            System.out.println("Horas Extraordinarias: " + horasExtraordinarias);
        }

        // Se utiliza printf para formatear la salida a dos decimales (%f) [cite: 74, 77]
        System.out.printf("\nEl salario semanal total es: %.2f €%n", salario); 
        
        entrada.close();
    }
}