package src.tareas;

import java.time.LocalDate;

public class TareaTest {
        public static void main(String[] args) {
        Tarea tarea1 = new Tarea("Ir al supermercado", 2, LocalDate.now().plusDays(1), false);
        Tarea tarea2 = new Tarea("Consultar dudas al profesor", 1, LocalDate.now().minusDays(1), true);
        Tarea tarea3 = new Tarea("Ir al cine", 3, LocalDate.now().minusDays(1), false);

        System.out.println(tarea1.mostrar());
        System.out.println(tarea2.mostrar()); 
        System.out.println(tarea3.mostrar()); 
    }
}
