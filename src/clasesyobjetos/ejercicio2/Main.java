package clasesyobjetos.ejercicio2;

public class Main {
    // Crea dos libros con su constructor y muestra sus datos.
    public static void main(String[] args) {
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);
        Libro libro2 = new Libro("Ficciones", "Jorge Luis Borges", 1944);

        libro1.mostrarDatos();
        libro2.mostrarDatos();
    }
}
