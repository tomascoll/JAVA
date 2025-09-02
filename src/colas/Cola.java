package src.colas;

import src.tipoElemento.TipoElemento;

public class Cola {
    private static final int TAMANIO_MAXIMO = 10;
    private TipoElemento[] valores;
    private int frente;
    private int fin;

    public Cola() {
        valores = new TipoElemento[TAMANIO_MAXIMO + 1];
        frente = 0;
        fin = 0;
    }

    public boolean esLlena() {
        return fin == TAMANIO_MAXIMO;
    }

    public boolean esVacia() {
        return frente <= 0;
    }

    public boolean encolar(TipoElemento elemento) {
        if (esLlena()) {
            return false;
        }
        fin++;
        valores[fin] = elemento;
        if (esVacia()) {
            frente = fin;
        }
        return true;
    }

    public TipoElemento desencolar() {
        if (esVacia()) {
            return null;
        }

        TipoElemento elemento = valores[frente];
        for (int i = frente; i <= fin - 1; i++) {
            valores[i] = valores[i + 1];
        }
        fin--;

        if (fin < frente) {
            frente = 0;
            fin = 0;
        }

        return elemento;
    }

    public TipoElemento recuperar() {
        return esVacia() ? null : valores[frente];
    }

    public void mostrar() {
        if (esVacia()) {
            System.out.println("COLA VACIA !!!");
            return;
        }

        Cola auxiliar = new Cola();
        System.out.println("-------------------------------------");
        System.out.println("Imprimiendo las Claves de la Cola");
        System.out.println("-------------------------------------");

        while (!esVacia()) {
            TipoElemento x = desencolar();
            System.out.println("Clave: " + x.getClave());
            auxiliar.encolar(x);
        }

        while (!auxiliar.esVacia()) {
            encolar(auxiliar.desencolar());
        }

        System.out.println();
    }
}

