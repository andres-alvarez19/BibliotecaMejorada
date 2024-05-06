package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class GestorLibro {
    private List<Libro> libros;

    public GestorLibro() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }
    public void modificarLibro(Libro libro, String titulo) {
        libro.setTitulo(titulo);
    }
    public void agregarEjemplares(Libro libro, int cantidad) {
        libro.agregarEjemplares(cantidad);
    }
    public void quitarEjemplares(Libro libro, int cantidad) {
        libro.eliminarEjemplares(cantidad);
    }
    public List<Libro> obtenerLibros() {
        return libros;
    }
}
