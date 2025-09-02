package src.administrador_tareas;

import java.time.LocalDate;

import src.tareas.TareaConTitulo;

public class AdministradorTest {
        public static void main(String[] args) {
        AdministradorTareas admin = new AdministradorTareas();

        TareaConTitulo t1 = new TareaConTitulo("Ir al supermercado", "Comprar comida", 2,
                LocalDate.now().plusDays(1), LocalDate.now());
        TareaConTitulo t2 = new TareaConTitulo("Consultar repuesto", "Llamar al mecanico", 3,
                LocalDate.now().minusDays(1), LocalDate.now().minusDays(2));
        TareaConTitulo t3 = new TareaConTitulo("Ir al cine", "Ver pelicula", 2,
                LocalDate.now().minusDays(1), LocalDate.now());
        TareaConTitulo t4 = new TareaConTitulo("Estudiar Java", "Repasar clases", 1,
                LocalDate.now().plusDays(3), LocalDate.now().plusDays(2));

        admin.agregarTarea(t1);
        admin.agregarTarea(t2);
        admin.agregarTarea(t3);
        admin.agregarTarea(t4);

        t2.marcarComoCompleta();

        System.out.println("Tareas activas : ");
        admin.imprimirTareas();
    }
}
