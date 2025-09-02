package src.juego;

import java.util.Set;

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Diccionario diccionario;

    public Juego(String nombre1, String nombre2, Set<String> palabrasValidas) {
        this.jugador1 = new Jugador(nombre1);
        this.jugador2 = new Jugador(nombre2);
        this.diccionario = new Diccionario(palabrasValidas);
    }

    public void asignarPalabraAJugador(String palabra, int numeroJugador) {
        if (numeroJugador == 1) {
            jugador1.agregarPalabra(palabra, diccionario);
        } else {
            jugador2.agregarPalabra(palabra, diccionario);
        }
    }

    public void mostrarGanador() {
        int puntaje1 = jugador1.calcularPuntaje();
        int puntaje2 = jugador2.calcularPuntaje();

        System.out.println(jugador1.getNombre() + ": " + puntaje1 + " puntos");
        System.out.println(jugador2.getNombre() + ": " + puntaje2 + " puntos");

        if (puntaje1 > puntaje2) {
            System.out.println("Ganador: " + jugador1.getNombre());
        } else if (puntaje2 > puntaje1) {
            System.out.println("Ganador: " + jugador2.getNombre());
        } else {
            System.out.println("Empate!");
        }
    }
}
