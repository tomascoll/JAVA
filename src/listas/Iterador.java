package src.listas;

import src.tipoElemento.TipoElemento;

public class Iterador {
    private Lista lista;
    private int posicionActual;

    public Iterador(Lista lista) {
        this.lista = lista;
        this.posicionActual = 0;
    }

    public boolean haySiguiente() {
        return posicionActual < lista.longitud();
    }

    public TipoElemento siguiente() {
        if (haySiguiente()) {
            return lista.recuperar(++posicionActual);
        }
        return null;
    }
}
