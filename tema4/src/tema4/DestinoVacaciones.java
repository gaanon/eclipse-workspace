package tema4;

import java.util.Scanner;

public class DestinoVacaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Sugerencia de Destino de Vacaciones ---");
        System.out.print("¿Prefieres playa o montaña? (P/M): ");
        String tipo = entrada.nextLine().toUpperCase();

        // Primer nivel de IF
        if (tipo.equals("P")) { 
            // IF anidado (segundo nivel) [cite: 94]
            System.out.print("¿Prefieres actividades tranquilas (T) o fiestas/vida nocturna (F)?: ");
            String ambiente = entrada.nextLine().toUpperCase();
            
            if (ambiente.equals("T")) {
                System.out.println("\nTe sugiero un destino de playa tranquilo, como las Islas Canarias.");
            } else if (ambiente.equals("F")) {
                System.out.println("\nTe sugiero un destino de playa con mucha vida nocturna, como Ibiza.");
            } else {
                System.out.println("\nOpción de ambiente no válida. Sugerencia por defecto: Cancún.");
            }
            
        } else if (tipo.equals("M")) {
            // IF anidado (segundo nivel) [cite: 94]
            System.out.print("¿Prefieres nieve (N) o senderismo/bosque (S)?: ");
            String actividad = entrada.nextLine().toUpperCase();
            
            if (actividad.equals("N")) {
                System.out.println("\nTe sugiero unas vacaciones de montaña con nieve, como los Alpes Suizos.");
            } else if (actividad.equals("S")) {
                System.out.println("\nTe sugiero un destino de montaña para senderismo, como los Pirineos.");
            } else {
                System.out.println("\nOpción de actividad no válida. Sugerencia por defecto: Patagonia.");
            }
            
        } else {
            System.out.println("\nOpción de preferencia (P/M) no válida. No se puede dar una sugerencia.");
        }

        entrada.close();
    }
}