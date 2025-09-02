package src.tareas;
import java.time.LocalDate;

public class TareasExt {
    private String descripcion;
    private int prioridad;
    private boolean completa;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;

    public TareasExt(String descripcion, int prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio, boolean completa) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
        this.fechaRecordatorio = fechaRecordatorio;
        this.completa = completa;
        actualizarPrioridad();
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

    public void cambiarPrioridad(int nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
    }

    public void actualizarPrioridad() {
        if (!completa && (fechaRecordatorio != null && !LocalDate.now().isBefore(fechaRecordatorio))) {
            this.prioridad = 3;
        }
    }

    public String mostrar() {
        String prefijo = "";
        if (!completa && fechaRecordatorio != null && !LocalDate.now().isBefore(fechaRecordatorio)) {
            prefijo = "(por vencer) ";
        }
        return prefijo + descripcion;
    }

    @Override
    public String toString() {
        return mostrar() + " | Prioridad: " + prioridad + " | Completa: " + completa;
    }
}
