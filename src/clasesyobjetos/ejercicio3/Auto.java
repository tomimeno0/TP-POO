package clasesyobjetos.ejercicio3;

public class Auto {
    private String marca;
    private String modelo;
    private String color;

    // El constructor recibe los datos iniciales del objeto.
    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    // Arma y muestra una frase con los datos del auto.
    public void mostrarDatos() {
        System.out.println("Tengo un " + marca + " modelo " + modelo + " de color " + color);
    }
}
