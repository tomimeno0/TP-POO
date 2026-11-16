package herencia.ejercicio1;

public class Empleado extends Persona {
    private double salario;

    // El constructor recibe los datos iniciales del objeto.
    public Empleado(String nombre, int edad, double salario) {
        // La clase padre inicializa los atributos que le pertenecen.
        super(nombre, edad);
        setSalario(salario);
    }

    // Devuelve el salario.
    public double getSalario() {
        return salario;
    }

    // Valida el nuevo valor y cambia el salario.
    public void setSalario(double salario) {
        if (!Double.isFinite(salario) || salario < 0) {
            throw new IllegalArgumentException("El salario debe ser un número mayor o igual a cero.");
        }
        this.salario = salario;
    }

    // Muestra los datos de Persona y el salario del empleado.
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: $" + salario);
    }
}
