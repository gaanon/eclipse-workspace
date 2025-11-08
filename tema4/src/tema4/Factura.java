package tema4;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double ivaAplicado = 0.0;
        
        System.out.println("--- TAREA 5: Facturación y Descuentos ---");

        System.out.print("Introduce la Base Imponible del producto (€): ");
        double baseImponible = entrada.nextDouble();
        
        // Consumir el salto de línea para que nextLine() funcione correctamente después de nextDouble() [cite: 59, 60]
        entrada.nextLine(); 

        System.out.print("Tipo de IVA (General, Reducido, Superreducido): ");
        String tipoIVA = entrada.nextLine().toLowerCase();

        // Uso de switch para el IVA
        switch (tipoIVA) {
            case "general":
                ivaAplicado = 0.21; // 21% 
                break;
            case "reducido":
                ivaAplicado = 0.10; // 10% 
                break;
            case "superreducido":
                ivaAplicado = 0.04; // 4% 
                break;
            default:
                System.out.println("Tipo de IVA no reconocido. Se aplicará IVA General (21%).");
                ivaAplicado = 0.21;
        }

        // Cálculo del precio con IVA
        double precioConIVA = baseImponible * (1 + ivaAplicado);
        double precioFinal = precioConIVA;
        
        System.out.print("Introduce el Código Promocional (nopro, mitad, menos5, 5por): ");
        String promocion = entrada.nextLine().toLowerCase();
        
        // Uso de switch para la promoción
        switch (promocion) {
            case "nopro": // no aplica promoción [cite: 33]
                // No se hace nada, precioFinal es igual a precioConIVA
                break;
            case "mitad": // reduce el precio a la mitad [cite: 34]
                precioFinal /= 2;
                System.out.println("Promoción: MITAD aplicada. Precio Con IVA: " + precioConIVA);
                break;
            case "menos5": // descuenta 5 € [cite: 35]
                precioFinal -= 5.0;
                System.out.println("Promoción: MENOS5 aplicada. Precio Con IVA: " + precioConIVA);
                break;
            case "5por": // descuenta el 5% [cite: 36]
                precioFinal *= 0.95; // 1 - 0.05 = 0.95
                System.out.println("Promoción: 5POR aplicada. Precio Con IVA: " + precioConIVA);
                break;
            default:
                System.out.println("Código promocional no válido. No se aplica descuento.");
        }
        
        System.out.println("\n--- DESGLOSE ---");
        System.out.printf("Base Imponible: %.2f €%n", baseImponible);
        System.out.printf("Total IVA (%.0f%%): %.2f €%n", ivaAplicado * 100, precioConIVA - baseImponible);
        System.out.printf("PRECIO FINAL A PAGAR: %.2f €%n", precioFinal);

        entrada.close();
    }
}