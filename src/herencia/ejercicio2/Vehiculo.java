package herencia.ejercicio2;

public class Vehiculo {
    private String marca;
    private String modelo;

    // El constructor recibe los datos iniciales del objeto.
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Devuelve la marca.
    public String getMarca() {
        return marca;
    }

    // Cambia la marca.
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Devuelve el modelo.
    public String getModelo() {
        return modelo;
    }

    // Cambia el modelo.
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
