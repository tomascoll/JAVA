package src.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Fechas {
    
    public static LocalDate parsearFecha(String fechaStr, String formato) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
            return LocalDate.parse(fechaStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Formato invalido: " + formato);
            return null;
        }
    }

    public static boolean estaEntre(LocalDate fecha, LocalDate inicio, LocalDate fin) {
        return (fecha.isEqual(inicio) || fecha.isAfter(inicio)) &&
               (fecha.isEqual(fin) || fecha.isBefore(fin));
    }

    public static boolean esMayor(LocalDate f1, LocalDate f2) {
        return f1.isAfter(f2);
    }

    public static boolean esMenor(LocalDate f1, LocalDate f2) {
        return f1.isBefore(f2);
    }
}
