package src.administrador_tareas;

import java.util.*;
import java.util.stream.Collectors;

import src.tareas.TareaConTitulo;

public class AdministradorTareas {
    private List<TareaConTitulo> listaTareas;

    public AdministradorTareas() {
        this.listaTareas = new ArrayList<>();
    }

    public void agregarTarea(TareaConTitulo tarea) {
        listaTareas.add(tarea);
    }

    public List<TareaConTitulo> buscarPorTitulo(String titulo) {
        return listaTareas.stream()
            .filter(t -> t.getTitulo().equalsIgnoreCase(titulo))
            .collect(Collectors.toList());
    }

    public List<TareaConTitulo> listarNoVencidasOrdenadas() {
        return listaTareas.stream()
            .filter(t -> !t.estaVencida())
            .sorted(Comparator.comparingInt(TareaConTitulo::getPrioridad)
                .thenComparing(TareaConTitulo::getFechaVencimiento))
            .collect(Collectors.toList());
    }

    public void imprimirTareas() {
        for (TareaConTitulo t : listarNoVencidasOrdenadas()) {
            System.out.println(t.mostrar());
        }
    }
}
