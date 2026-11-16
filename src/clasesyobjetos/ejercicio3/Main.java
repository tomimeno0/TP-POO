package clasesyobjetos.ejercicio3;

public class Main {
    // Crea tres autos y muestra los datos de cada uno.
    public static void main(String[] args) {
        Auto auto1 = new Auto("Fiat", "Cronos", "blanco");
        Auto auto2 = new Auto("Ford", "Fiesta", "azul");
        Auto auto3 = new Auto("Renault", "Sandero", "gris");

        auto1.mostrarDatos();
        auto2.mostrarDatos();
        auto3.mostrarDatos();
    }
}
