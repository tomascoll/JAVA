package src.tareas;

import java.time.LocalDate;

public class TareaExtTest {
        public static void main(String[] args) {
        TareasExt t1 = new TareasExt("Ir al cine", 2,
                LocalDate.of(2025, 9, 8),
                LocalDate.of(2025, 9, 3),
                false);

        TareasExt t2 = new TareasExt("Estudiar biologia", 1,
                LocalDate.of(2025, 9, 2),
                LocalDate.of(2025, 8, 30),
                true);

        TareasExt t3 = new TareasExt("Comprar comida", 2,
                LocalDate.of(2025, 9, 2),
                LocalDate.of(2025, 9, 1),
                false);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
