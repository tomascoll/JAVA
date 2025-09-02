package src.pilas;

import src.tipoElemento.TipoElemento;

public class Pila {
    private static final int TAMANIO_MAXIMO = 10;
    private TipoElemento[] valores;
    private int tope;

    public Pila() {
        valores = new TipoElemento[TAMANIO_MAXIMO + 1];
        tope = 0;
    }

    public boolean esVacia() {
        return tope <= 0;
    }

    public boolean esLlena() {
        return tope == TAMANIO_MAXIMO;
    }

    public boolean apilar(TipoElemento elemento) {
        if (esLlena()) return false;
        valores[++tope] = elemento;
        return true;
    }

    public TipoElemento desapilar() {
        if (esVacia()) return null;
        return valores[tope--];
    }

    public TipoElemento tope() {
        if (esVacia()) return null;
        return valores[tope];
    }

    public void mostrar() {
        if (esVacia()) {
            System.out.println("PILA VACÍA !!!");
            return;
        }

        Pila aux = new Pila();
        System.out.print("Contenido de la pila: ");

        while (!esVacia()) {
            TipoElemento x = desapilar();
            System.out.print(x.getClave() + " ");
            aux.apilar(x);
        }

        while (!aux.esVacia()) {
            apilar(aux.desapilar());
        }

        System.out.println();
    }
}

