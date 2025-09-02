package src.tareas;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private boolean completa;
    private LocalDate fechaLimite;

    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite, boolean completa) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
        this.completa = completa;
    }

    public void modificarDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    public void cambiarPrioridad(int nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
    }

    public void marcarComoCompleta() {
        this.completa = true;
    }

    public boolean estaCompleta() {
        return completa;
    }

    public boolean estaVencida() {
        return !completa && LocalDate.now().isAfter(fechaLimite);
    }

    public String mostrar() {
        if (estaVencida()) {
            return "(Vencida)... " + descripcion;
        }
        return descripcion;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                ", completa=" + completa +
                ", fechaLimite=" + fechaLimite +
                '}';
    }
}
