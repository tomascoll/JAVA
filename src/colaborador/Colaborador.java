package src.colaborador;

import java.util.ArrayList;
import java.util.List;

import src.tareas.TareaColaborador;

public class Colaborador {
    private String nombre;
    private List<TareaColaborador> tareasRealizadas;

    public Colaborador(String nombre) {
        this.nombre = nombre;
        this.tareasRealizadas = new ArrayList<>();
    }

    public void registrarTareaRealizada(TareaColaborador tarea) {
        tareasRealizadas.add(tarea);
    }

    public List<TareaColaborador> getTareasRealizadas() {
        return tareasRealizadas;
    }

    public String getNombre() {
        return nombre;
    }
}
