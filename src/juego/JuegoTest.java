package src.juego;

import java.util.Set;

public class JuegoTest {
    public static void main(String[] args) {
        Set<String> diccionario = Set.of("java", "quiz", "zorro", "clave", "xilofon");

        Juego juego = new Juego("Eva", "Luis", diccionario);

        juego.asignarPalabraAJugador("java", 1);
        juego.asignarPalabraAJugador("queso", 1);
        juego.asignarPalabraAJugador("clave", 2);
        juego.asignarPalabraAJugador("zorro", 2);
        juego.asignarPalabraAJugador("calefon", 2);

        juego.mostrarGanador();
    }
}
