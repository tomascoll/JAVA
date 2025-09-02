package src.colaborador;

import java.time.LocalDate;

import src.tareas.TareaColaborador;

public class ColaboradorTest {
    public static void main(String[] args) {
        Colaborador eva = new Colaborador("Eva");
        Colaborador luis = new Colaborador("Luis");

        TareaColaborador tarea1 = new TareaColaborador("Preparar informe mensual", 2, LocalDate.of(2025, 9, 5));
        TareaColaborador tarea2 = new TareaColaborador("Actualizar base de datos", 1, LocalDate.of(2025, 9, 10));

        AdministradorTareasColab admin = new AdministradorTareasColab();

        admin.asignarColaboradorATarea(tarea1, eva);
        admin.asignarColaboradorATarea(tarea1, luis);
        admin.asignarColaboradorATarea(tarea2, luis);

        admin.marcarTareaComoRealizadaPor(tarea1, luis);
        admin.marcarTareaComoRealizadaPor(tarea2, luis);

        System.out.println("Tareas realizadas por Luis:");
        for (TareaColaborador t : admin.obtenerTareasRealizadasPor(luis)) {
            System.out.println("- " + t.getDescripcion() + " (finalizada el " + t.getFechaFinalizacion() + ")");
        }
    }    
}
