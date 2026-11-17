package clasesyobjetos.ejercicio3;

public class Main {
    // Crea tres autos y muestra los datos de cada uno.
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.marca = "Fiat";
        auto1.modelo = "Cronos";
        auto1.color = "blanco";

        Auto auto2 = new Auto();
        auto2.marca = "Ford";
        auto2.modelo = "Fiesta";
        auto2.color = "azul";

        Auto auto3 = new Auto();
        auto3.marca = "Renault";
        auto3.modelo = "Sandero";
        auto3.color = "gris";

        auto1.mostrarDatos();
        auto2.mostrarDatos();
        auto3.mostrarDatos();
    }
}
