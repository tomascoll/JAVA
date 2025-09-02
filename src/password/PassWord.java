package src.password;

import java.util.Random;

public class PassWord {
    private int longitud;
    private String contraseña;

    public PassWord() {
        this.longitud = 8;
        this.contraseña = generarContraseña();
    }

    public PassWord(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarContraseña();
    }

    private String generarContraseña() {
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String todos = mayus + minus + numeros;

        StringBuilder sb = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < longitud; i++) {
            sb.append(todos.charAt(rand.nextInt(todos.length())));
        }

        return sb.toString();
    }

    public boolean esFuerte() {
        int mayus = 0, minus = 0, nums = 0;

        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) mayus++;
            else if (Character.isLowerCase(c)) minus++;
            else if (Character.isDigit(c)) nums++;
        }

        return mayus > 2 && minus > 1 && nums >= 2;
    }

    public void regenerarFuerte() {
        do {
            this.contraseña = generarContraseña();
        } while (!esFuerte());
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int nuevaLongitud) {
        this.longitud = nuevaLongitud;
        this.contraseña = generarContraseña();
    }
}

