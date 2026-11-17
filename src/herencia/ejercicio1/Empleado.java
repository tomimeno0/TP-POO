package herencia.ejercicio1;

public class Empleado extends Persona {
    private double salario;

    // El constructor recibe los datos iniciales del objeto.
    public Empleado(String nombre, int edad, double salario) {
        // La clase padre inicializa los atributos que le pertenecen.
        super(nombre, edad);
        this.salario = salario;
    }

    // Devuelve el salario.
    public double getSalario() {
        return salario;
    }

    // Cambia el salario.
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
