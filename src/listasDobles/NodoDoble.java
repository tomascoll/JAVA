package src.listasDobles;
import src.tipoElemento.TipoElemento;

public class NodoDoble {
    private TipoElemento elemento;
    private NodoDoble anterior;
    private NodoDoble siguiente;

    public NodoDoble(TipoElemento elemento) {
        this.elemento = elemento;
    }

    public TipoElemento getElemento() {
        return elemento;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }
}

