package clasesyobjetos.ejercicio2;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;

    // El constructor recibe los datos iniciales del objeto.
    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    // Muestra el título, el autor y el año del libro.
    public void mostrarDatos() {
        System.out.println(titulo + " | " + autor + " | " + anio);
    }
}
