package src.listas;

import java.util.ArrayList;
import java.util.List;
import src.tipoElemento.TipoElemento;

public class Lista {
    private static final int TAMANIO_MAXIMO = 100;
    private List<TipoElemento> valores;

    public Lista() {
        valores = new ArrayList<>(TAMANIO_MAXIMO);
    }

    public boolean esVacia() {
        return valores.isEmpty();
    }

    public int longitud() {
        return valores.size();
    }

    public boolean agregar(TipoElemento elemento) {
        if (valores.size() >= TAMANIO_MAXIMO) return false;
        valores.add(elemento);
        return true;
    }

    public boolean insertar(TipoElemento elemento, int pos) {
        if (valores.size() >= TAMANIO_MAXIMO) return false;
        if (pos > longitud()) {
            return agregar(elemento);
        }
        valores.add(pos - 1, elemento);
        return true;
    }

    public boolean eliminar(int pos) {
        if (pos < 1 || pos > longitud()) return false;
        valores.remove(pos - 1);
        return true;
    }

    public TipoElemento recuperar(int pos) {
        if (pos < 1 || pos > longitud()) return null;
        return valores.get(pos - 1);
    }

    public Iterador iterador() {
        return new Iterador(this);
    }
}
