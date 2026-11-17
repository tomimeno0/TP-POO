package herencia.ejercicio1;

public class Main {
    // Crea un empleado y muestra todos sus datos.
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Lucía", 25, 650000);
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Salario: $" + empleado.getSalario());
    }
}
