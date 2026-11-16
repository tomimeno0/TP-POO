package clasesyobjetos.ejercicio4;

public class Main {
    // Asigna un saldo usando el setter y lo consulta usando el getter.
    public static void main(String[] args) {
        CuentaBncaria cuenta = new CuentaBncaria();
        cuenta.setSaldo(1500);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
    }
}
