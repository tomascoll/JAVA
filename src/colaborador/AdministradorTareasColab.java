package src.colaborador;

import java.util.List;

import src.tareas.TareaColaborador;

public class AdministradorTareasColab {
    
    public void asignarColaboradorATarea(TareaColaborador tarea, Colaborador colaborador) {
        tarea.asignarColaborador(colaborador);
    }

    public void marcarTareaComoRealizadaPor(TareaColaborador tarea, Colaborador colaborador) {
        tarea.marcarComoRealizadaPor(colaborador);
    }

    public List<TareaColaborador> obtenerTareasRealizadasPor(Colaborador colaborador) {
        return colaborador.getTareasRealizadas();
    }
}
