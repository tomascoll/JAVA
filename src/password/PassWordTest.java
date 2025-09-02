package src.password;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassWordTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas contraseñas quieres generar? : ");
        int cantidad = sc.nextInt();

        List<PassWord> lista = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            PassWord p = new PassWord();
            if (!p.esFuerte()) {
                p.regenerarFuerte();
            }
            lista.add(p);
        }

        for (PassWord p : lista) {
            String estado = p.esFuerte() ? "Fuerte" : "Debil";
            System.out.println(p.getContraseña() + " - " + estado);
        }
    }
}
