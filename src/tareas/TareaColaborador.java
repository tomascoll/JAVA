package src.tareas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import src.colaborador.Colaborador;

public class TareaColaborador {
    private String descripcion;
    private int prioridad;
    private LocalDate vencimiento;
    private List<Colaborador> colaboradores;
    private Colaborador realizadaPor;
    private LocalDate fechaFinalizacion;

    public TareaColaborador(String descripcion, int prioridad, LocalDate vencimiento) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.vencimiento = vencimiento;
        this.colaboradores = new ArrayList<>();
    }

    public void asignarColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    public void marcarComoRealizadaPor(Colaborador colaborador) {
        this.realizadaPor = colaborador;
        this.fechaFinalizacion = LocalDate.now();
        colaborador.registrarTareaRealizada(this);
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Colaborador getRealizadaPor() {
        return realizadaPor;
    }    
}
