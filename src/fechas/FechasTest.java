package src.fechas;

import java.time.LocalDate;

public class FechasTest {
        public static void main(String[] args) {
        LocalDate fecha1 = Fechas.parsearFecha("02-09-2025", "dd-MM-yyyy");
        LocalDate fecha2 = Fechas.parsearFecha("09-09-2025", "dd-MM-yyyy");
        LocalDate fecha3 = Fechas.parsearFecha("06-09-2025", "dd-MM-yyyy");

        System.out.println("Fecha3 está entre Fecha1 y Fecha2? " + Fechas.estaEntre(fecha3, fecha1, fecha2));
        System.out.println("Fecha3 es mayor que Fecha1? " + Fechas.esMayor(fecha3, fecha1));
        System.out.println("Fecha3 es menor que Fecha2? " + Fechas.esMenor(fecha3, fecha2));
    }
}
