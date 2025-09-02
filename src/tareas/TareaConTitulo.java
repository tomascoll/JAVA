package src.tareas;

import java.time.LocalDate;

public class TareaConTitulo {
    private String titulo;
    private String descripcion;
    private int prioridad;
    private LocalDate fechaVencimiento;
    private LocalDate fechaRecordatorio;
    private boolean completa;

    public TareaConTitulo(String titulo, String descripcion, int prioridad, LocalDate fechaVencimiento, LocalDate fechaRecordatorio) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaRecordatorio = fechaRecordatorio;
        this.completa = false;
    }

    public boolean estaVencida() {
        return !completa && LocalDate.now().isAfter(fechaVencimiento);
    }

    public boolean estaPorVencer() {
        return !completa && (fechaRecordatorio != null && !LocalDate.now().isBefore(fechaRecordatorio));
    }

    public void marcarComoCompleta() {
        this.completa = true;
    }

    public String mostrar() {
        String estado = "";
        if (estaVencida()) {
            estado = "(Vencida) ";
        } else if (estaPorVencer()) {
            estado = "(Por vencer) ";
            prioridad = 1;
        }
        return estado + titulo + " - Prioridad: " + prioridad + " - Vence: " + fechaVencimiento;
    }

    public boolean estaCompleta() {
        return completa;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
}
