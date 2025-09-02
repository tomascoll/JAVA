package src.juego;

import java.util.List;
import java.util.ArrayList;

class Jugador {
    private String nombre;
    private List<String> palabras;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.palabras = new ArrayList<>();
    }

    public void agregarPalabra(String palabra, Diccionario diccionario) {
        if (diccionario.esValida(palabra)) {
            palabras.add(palabra);
        }
    }

    public int calcularPuntaje() {
        int puntaje = 0;
        for (String palabra : palabras) {
            puntaje += palabra.length();
            for (char c : palabra.toLowerCase().toCharArray()) {
                if ("kzxywq".indexOf(c) != -1) {
                    puntaje += 1;
                }
            }
        }
        return puntaje;
    }

    public String getNombre() {
        return nombre;
    }
}