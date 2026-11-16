package herencia.ejercicio2;

public class Auto extends Vehiculo {
    private int cant_Puertas;

    // El constructor recibe los datos iniciales del objeto.
    public Auto(String marca, String modelo, int cant_Puertas) {
        // La clase padre inicializa los atributos que le pertenecen.
        super(marca, modelo);
        setCant_Puertas(cant_Puertas);
    }

    // Devuelve la cantidad de puertas.
    public int getCant_Puertas() {
        return cant_Puertas;
    }

    // Valida el nuevo valor y cambia la cantidad de puertas.
    public void setCant_Puertas(int cant_Puertas) {
        if (cant_Puertas <= 0) {
            throw new IllegalArgumentException("La cantidad de puertas debe ser mayor que cero.");
        }
        this.cant_Puertas = cant_Puertas;
    }

    // Muestra la marca, el modelo y la cantidad de puertas.
    public void mostrarDatos() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cantidad de puertas: " + cant_Puertas);
    }
}
