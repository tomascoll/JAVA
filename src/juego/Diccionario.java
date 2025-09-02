package src.juego;

import java.util.Set;
import java.util.HashSet;

class Diccionario {
    private Set<String> palabrasValidas;

    public Diccionario(Set<String> palabras) {
        this.palabrasValidas = new HashSet<>(palabras);
    }

    public boolean esValida(String palabra) {
        return palabrasValidas.contains(palabra.toLowerCase());
    }
}