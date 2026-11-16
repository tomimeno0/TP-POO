package clasesyobjetos.ejercicio5;

public class Main {
    // Asigna la base y la altura con los setters y muestra el área.
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setBase(5);
        rectangulo.setAltura(3);

        System.out.println("Área: " + rectangulo.calcularArea());
    }
}
