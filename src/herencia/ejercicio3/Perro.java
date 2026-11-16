package herencia.ejercicio3;

public class Perro extends Animal {
    private String raza;

    // El constructor recibe los datos iniciales del objeto.
    public Perro(String nombre, int edad, String raza) {
        // La clase padre inicializa los atributos que le pertenecen.
        super(nombre, edad);
        setRaza(raza);
    }

    // Devuelve la raza.
    public String getRaza() {
        return raza;
    }

    // Valida el nuevo valor y cambia la raza.
    public void setRaza(String raza) {
        if (raza == null || raza.isBlank()) {
            throw new IllegalArgumentException("Completá la raza.");
        }
        this.raza = raza;
    }

    // Muestra el mensaje que indica que el perro está ladrando.
    public void ladrar() {
        System.out.println("el perro está ladrando");
    }
}
