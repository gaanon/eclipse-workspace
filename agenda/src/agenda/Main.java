package agenda;

import java.util.Scanner;

/**
* Esta clase ejecuta la agenda.
*/
public class Main {

 public static void main(String[] args) {
     // 1. Configurar la herramienta para obtener la entrada del usuario
     Scanner scanner = new Scanner(System.in);

     // 2. Dar la bienvenida al usuario
     System.out.println("Bienvenido a tu agenda!");
     System.out.println("Vamos a crear un contacto nuevo.");

     // 3. Obtener el nombre obligatorio
     // Usamos un bucle simple para asegurarnos de que no introduzca un nombre en blanco
     String nombre = "";
     while (nombre.isEmpty()) {
         System.out.println("Cual es el nombre? (Obligatorio):");
         nombre = scanner.nextLine();
         if (nombre.isEmpty()) {
             System.out.println("El nombre no puede estar vacio. Intentalo otra vez.");
         }
     }

     // 4. Crear el objeto Contacto
     Contacto nuevoContacto = new Contacto(nombre);

     // 5. Obtener el número de teléfono opcional
     System.out.println("Cual es el numero de telefono? (Opcional):");
     String telefono = scanner.nextLine();
     if (!telefono.isEmpty()) { // Solo asignar si el usuario escribió algo
    	 nuevoContacto.setTelefono(telefono);
     }

     // 6. Obtener el email opcional
     System.out.println("Cual es el email? (Opcional):");
     String email = scanner.nextLine();
     if (!email.isEmpty()) {
    	 nuevoContacto.setEmail(email);
     }

     // 7. Imprimir los detalles finales del contacto
     System.out.println("\n---");
     System.out.println("Contacto grabado!");
     System.out.println("---");
     // Usamos los métodos 'getter' para recuperar los datos del objeto
     System.out.println("Nombre: " + nuevoContacto.getNombre());
     System.out.println("Telefono: " + nuevoContacto.getTelefono());
     System.out.println("Email: " + nuevoContacto.getEmail());
     System.out.println("Direccion: " + nuevoContacto.getDireccion());
     System.out.println("---");
     
     // Cerrar el scanner (buena práctica)
     scanner.close();
 }
}