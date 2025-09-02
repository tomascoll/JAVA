package src.ecuacion;

import java.util.List;

public class EcuacionTest {
    public static void main(String[] args) {
        Ecuacion eq1 = new Ecuacion(1, -3, 2);
        Ecuacion eq2 = new Ecuacion(1, -2, 1);
        Ecuacion eq3 = new Ecuacion(1, 2, 5);

        probarEcuacion(eq1, 2);
        probarEcuacion(eq2, 1);
        probarEcuacion(eq3, -1);
    }

    public static void probarEcuacion(Ecuacion eq, double x) {
        System.out.println("Ecuacion: " + eq.mostrarEcuacion());
        System.out.println("Valor de y para x = " + x + ": " + eq.evaluar(x));

        List<Double> raices = eq.calcularRaices();
        if (raices.isEmpty()) {
            System.out.println("No tiene raices reales.");
        } else if (raices.size() == 1) {
            System.out.println("Raiz unica: " + raices.get(0));
        } else {
            System.out.println("Raices: " + raices.get(0) + " y " + raices.get(1));
        }

        System.out.println("------------------------------------------------");
    }
}
