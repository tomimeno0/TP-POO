package clasesyobjetos.ejercicio1;

public class Main {
    // Crea dos personas, asigna sus atributos y los muestra por consola.
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ana";
        persona1.edad = 17;

        Persona persona2 = new Persona();
        persona2.nombre = "Juan";
        persona2.edad = 18;

        System.out.println(persona1.nombre + " tiene " + persona1.edad + " años.");
        System.out.println(persona2.nombre + " tiene " + persona2.edad + " años.");
    }
}
