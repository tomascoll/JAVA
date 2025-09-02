package src.libro;

public class LibroTest {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Pinocho", "Carlo Lorenzini", 651, 10, "978-0-13-235088-4");
        Libro libro2 = new Libro("Pan de campo", "German Torres", 317, 1, "978-84-376-0494-7");

        System.out.println(libro1.mostrarDescripcion());
        System.out.println(libro2.mostrarDescripcion());

        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro con más paginas es: " + libro1.mostrarDescripcion());
        } else {
            System.out.println("El libro con más paginas es: " + libro2.mostrarDescripcion());
        }

        boolean prestamo1 = libro1.prestar();
        boolean prestamo2 = libro2.prestar();

        System.out.println("Se pudo prestar el libro 1? " + prestamo1);
        System.out.println("Se pudo prestar el libro 2? " + prestamo2);

        System.out.println(libro1.mostrarDescripcion());
        System.out.println(libro2.mostrarDescripcion());

        System.out.println("Cantidad total de prestamos realizados: " + Libro.getTotalPrestamosGlobal());
    }
}

