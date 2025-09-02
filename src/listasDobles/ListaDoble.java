package src.listasDobles;
import src.tipoElemento.TipoElemento;

public class ListaDoble {
    private NodoDoble cabeza;
    private NodoDoble cola;
    private int cantidad;

    public ListaDoble() {
        cabeza = null;
        cola = null;
        cantidad = 0;
    }

    public boolean esVacia() {
        return cantidad == 0;
    }

    public int longitud() {
        return cantidad;
    }

    public void agregar(TipoElemento elemento) {
        NodoDoble nuevo = new NodoDoble(elemento);
        if (esVacia()) {
            cabeza = cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        cantidad++;
    }

    public boolean eliminarPorClave(int clave) {
        NodoDoble actual = cabeza;
        while (actual != null) {
            if (actual.getElemento().getClave() == clave) {
                NodoDoble ant = actual.getAnterior();
                NodoDoble sig = actual.getSiguiente();

                if (ant != null) ant.setSiguiente(sig);
                else cabeza = sig;

                if (sig != null) sig.setAnterior(ant);
                else cola = ant;

                cantidad--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public TipoElemento recuperar(int posicion) {
        if (posicion < 0 || posicion >= cantidad) {
            throw new IndexOutOfBoundsException("Posición invalida: " + posicion);
        }

        NodoDoble actual = cabeza;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSiguiente();
        }

        return actual.getElemento();
    }

    public void insertar(int posicion, TipoElemento elemento) {
        if (posicion < 0 || posicion > cantidad) {
            throw new IndexOutOfBoundsException("Posición invalida: " + posicion);
        }

        NodoDoble nuevo = new NodoDoble(elemento);

        if (posicion == 0) {
            nuevo.setSiguiente(cabeza);
            if (cabeza != null) cabeza.setAnterior(nuevo);
            cabeza = nuevo;
            if (cantidad == 0) cola = nuevo;
        } else if (posicion == cantidad) {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        } else {
            NodoDoble actual = cabeza;
            for (int i = 0; i < posicion; i++) {
                actual = actual.getSiguiente();
            }
            NodoDoble anterior = actual.getAnterior();
            anterior.setSiguiente(nuevo);
            nuevo.setAnterior(anterior);
            nuevo.setSiguiente(actual);
            actual.setAnterior(nuevo);
        }
        cantidad++;
    }


}