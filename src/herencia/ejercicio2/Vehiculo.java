package herencia.ejercicio2;

public class Vehiculo {
    private String marca;
    private String modelo;

    // El constructor recibe los datos iniciales del objeto.
    public Vehiculo(String marca, String modelo) {
        setMarca(marca);
        setModelo(modelo);
    }

    // Devuelve la marca.
    public String getMarca() {
        return marca;
    }

    // Valida el nuevo valor y cambia la marca.
    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Completá la marca.");
        }
        this.marca = marca;
    }

    // Devuelve el modelo.
    public String getModelo() {
        return modelo;
    }

    // Valida el nuevo valor y cambia el modelo.
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Completá el modelo.");
        }
        this.modelo = modelo;
    }
}
