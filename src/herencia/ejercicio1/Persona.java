package herencia.ejercicio1;

public class Persona {
    private String nombre;
    private int edad;

    // El constructor recibe los datos iniciales del objeto.
    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    // Devuelve el nombre.
    public String getNombre() {
        return nombre;
    }

    // Valida el nuevo valor y cambia el nombre.
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Completá el nombre.");
        }
        this.nombre = nombre;
    }

    // Devuelve la edad.
    public int getEdad() {
        return edad;
    }

    // Valida el nuevo valor y cambia la edad.
    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }
}
