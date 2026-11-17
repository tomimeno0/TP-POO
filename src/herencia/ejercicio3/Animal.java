package herencia.ejercicio3;

public class Animal {
    private String nombre;
    private int edad;

    // El constructor recibe los datos iniciales del objeto.
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Devuelve el nombre.
    public String getNombre() {
        return nombre;
    }

    // Cambia el nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve la edad.
    public int getEdad() {
        return edad;
    }

    // Cambia la edad.
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
