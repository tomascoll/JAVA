package src.ecuacion;

import java.util.ArrayList;
import java.util.List;

public class Ecuacion {
    private final double a;
    private final double b;
    private final double c;

    public Ecuacion(double a, double b, double c) {
        if (a == 0) throw new IllegalArgumentException("El coeficiente 'a' no puede ser cero.");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public List<Double> calcularRaices() {
        List<Double> raices = new ArrayList<>();
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            raices.add(raiz1);
            raices.add(raiz2);
        } else if (discriminante == 0) {
            double raizUnica = -b / (2 * a);
            raices.add(raizUnica);
        }
        // discriminante < 0
        return raices;
    }

    public double evaluar(double x) {
        return a * x * x + b * x + c;
    }

    public String mostrarEcuacion() {
        return "y = " + a + "x² + " + b + "x + " + c;
    }
}
