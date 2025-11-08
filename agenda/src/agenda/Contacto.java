package agenda;

//Este archivo debe llamarse "Contacto.java"

/**
* Representa un solo contacto en la agenda.
* Esta clase utiliza encapsulación (campos privados, getters/setters públicos).
*/
public class Contacto {

 // --- Campos (Fields) ---
 // Estos son 'private' para proteger los datos.
 private String nombre;
 private String direccion;
 private String telefono;
 private String email;

 // --- Constructor ---
 /**
  * Construye un nuevo Contacto. Solo el nombre es obligatorio.
  * Los otros campos serán null (vacíos) por defecto.
  *
  * @param name El nombre obligatorio del contacto.
  */
 public Contacto(String nombre) {
     this.nombre = nombre;
     
     // No es necesario establecer los otros, son 'null' por defecto
     // this.direccion = null;
     // this.telefono = null;
     // this.email = "";
 }

 // --- Getters (para TODOS los campos) ---
 // Estos métodos permiten a otras clases LEER los datos.

 public String getNombre() {
     return this.nombre;
 }

 public String getDireccion() {
     return this.direccion;
 }

 public String getTelefono() {
     return this.telefono;
 }

 public String getEmail() {
     return this.email;
 }


 // --- Setters (para campos OPCIONALES) ---
 // Estos métodos permiten a otras clases ESCRIBIR o ACTUALIZAR los datos.
 // (No incluimos un 'setNombre' porque decidimos que solo se establece 
 // en el momento de la creación a través del constructor).

 public void setDireccion(String direccion) {
     this.direccion = direccion;
 }

 public void setTelefono(String telefono) {
     this.telefono = telefono;
 }

 public void setEmail(String email) {
     this.email = email;
 }
}