package clasesyobjetos.ejercicio5;

public class Rectangulo {
    private double base;
    private double altura;

    // Devuelve la base.
    public double getBase() {
        return base;
    }

    // Cambia la base.
    public void setBase(double base) {
        this.base = base;
    }

    // Devuelve la altura.
    public double getAltura() {
        return altura;
    }

    // Cambia la altura.
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Calcula el área del rectángulo multiplicando base por altura.
    public double calcularArea() {
        return base * altura;
    }
}
