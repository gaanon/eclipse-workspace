package tema4;

import java.util.Scanner;

public class Nomina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sueldoBase = 0.0;
        double irpf = 0.0;
        
        System.out.println("--- TAREA 6: Cálculo de Nómina ---");

        System.out.println("Selecciona tu cargo:");
        System.out.println("1. Programador Junior (950 €)");
        System.out.println("2. Programador Senior (1200 €)");
        System.out.println("3. Jefe de Proyecto (1600 €)");
        System.out.print("Opción (1-3): ");
        int cargoOpcion = entrada.nextInt();
        
        // Uso de switch para el Sueldo Base [cite: 39]
        switch (cargoOpcion) {
            case 1:
                sueldoBase = 950.0;
                break;
            case 2:
                sueldoBase = 1200.0;
                break;
            case 3:
                sueldoBase = 1600.0;
                break;
            default:
                System.out.println("Opción de cargo no válida.");
                entrada.close();
                return; // Termina el programa
        }
        
        System.out.print("Días visitando clientes fuera: ");
        int diasDieta = entrada.nextInt();

        // Consumir el salto de línea [cite: 59, 60]
        entrada.nextLine(); 

        System.out.print("Estado Civil (Soltero/Casado): ");
        String estadoCivil = entrada.nextLine().toLowerCase();
        
        // Uso de if-else para el IRPF [cite: 41, 92]
        if (estadoCivil.equals("soltero")) {
            irpf = 0.25; // 25% [cite: 41]
        } else if (estadoCivil.equals("casado")) {
            irpf = 0.20; // 20% [cite: 41]
        } else {
            System.out.println("Estado civil no reconocido. Se aplicará IRPF del 25% (Soltero).");
            irpf = 0.25;
        }

        // Cálculo de Componentes
        double dietas = diasDieta * 30.0; // 30€ por día [cite: 40]
        double sueldoBruto = sueldoBase + dietas;
        double retencionIRPF = sueldoBruto * irpf;
        double sueldoNeto = sueldoBruto - retencionIRPF;
        
        // Impresión de Nómina
        System.out.println("\n--- NÓMINA DESGLOSADA ---");
        System.out.printf("1. Sueldo Base: %.2f €%n", sueldoBase);
        System.out.printf("2. Dietas (%d días): %.2f €%n", diasDieta, dietas);
        System.out.printf("----------------------------- %n");
        System.out.printf("Sueldo Bruto: %.2f €%n", sueldoBruto);
        System.out.printf("IRPF (%.0f%%): -%.2f €%n", irpf * 100, retencionIRPF);
        System.out.printf("----------------------------- %n");
        System.out.printf("SUELDO NETO: %.2f €%n", sueldoNeto);

        entrada.close();
    }
}