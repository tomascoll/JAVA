package src.libro;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private int ejemplaresDisponibles;
    private int ejemplaresPrestados;
    private String isbn;

    private static int totalPrestamosGlobal = 0;

    public Libro(String titulo, String autor, int numPaginas, int ejemplaresIniciales, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.ejemplaresDisponibles = ejemplaresIniciales;
        this.ejemplaresPrestados = 0;
        this.isbn = isbn;
    }

    public boolean prestar() {
            if (ejemplaresDisponibles > 1) {
                ejemplaresDisponibles--;
                ejemplaresPrestados++;
                totalPrestamosGlobal++;
                return true;
            }
            return false;
        }

    public String mostrarDescripcion() {
        return "El libro \"" + titulo + "\" creado por el autor " + autor +
            " tiene " + numPaginas + " paginas, quedan " + ejemplaresDisponibles +
            " disponibles y se prestaron " + ejemplaresPrestados + ".";
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public static int getTotalPrestamosGlobal() {
        return totalPrestamosGlobal;
    }
}
