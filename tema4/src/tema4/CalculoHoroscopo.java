package tema4;

import java.util.Scanner;

public class CalculoHoroscopo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String horoscopo;
        
        // Se definen códigos ANSI para cumplir con el requisito de color [cite: 18]
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";

        System.out.println("--- Cálculo del Horóscopo ---");
        System.out.print("Introduce tu mes de nacimiento (1-12): ");
        int mes = entrada.nextInt();
        System.out.print("Introduce tu día de nacimiento: ");
        int dia = entrada.nextInt();

        // Uso de switch para seleccionar el mes [cite: 96]
        switch (mes) {
            case 1: // Enero
                // Operador Ternario: (condición) ? valor_si_verdadero : valor_si_falso [cite: 105]
                horoscopo = (dia < 20) ? "Capricornio" : "Acuario";
                break;
            case 2: // Febrero
                horoscopo = (dia < 19) ? "Acuario" : "Piscis";
                break;
            case 3: // Marzo
                horoscopo = (dia < 21) ? "Piscis" : "Aries";
                break;
            case 4: // Abril
                horoscopo = (dia < 20) ? "Aries" : "Tauro";
                break;
            case 5: // Mayo
                horoscopo = (dia < 21) ? "Tauro" : "Géminis";
                break;
            case 6: // Junio
                horoscopo = (dia < 21) ? "Géminis" : "Cáncer";
                break;
            case 7: // Julio
                horoscopo = (dia < 23) ? "Cáncer" : "Leo";
                break;
            case 8: // Agosto
                horoscopo = (dia < 23) ? "Leo" : "Virgo";
                break;
            case 9: // Septiembre
                horoscopo = (dia < 23) ? "Virgo" : "Libra";
                break;
            case 10: // Octubre
                horoscopo = (dia < 23) ? "Libra" : "Escorpio";
                break;
            case 11: // Noviembre
                horoscopo = (dia < 22) ? "Escorpio" : "Sagitario";
                break;
            case 12: // Diciembre
                horoscopo = (dia < 22) ? "Sagitario" : "Capricornio";
                break;
            default:
                horoscopo = "Fecha no válida.";
                // break; (opcional en default, pero buena práctica) [cite: 100]
        }

        System.out.printf("Tu horóscopo es: %s%s%s%n", ANSI_RED, horoscopo, ANSI_RESET); // Imprime en color [cite: 18]
        
        entrada.close();
    }
}