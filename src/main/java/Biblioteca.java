import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Libro> estanterias;
    public Biblioteca() {
        this.estanterias = new ArrayList<>();
    }
    public Biblioteca(List<Libro> estanterias) {
        this.estanterias = estanterias;
    }
    public void agregarLibro(Libro libro) {
        estanterias.add(libro);
    }
    public void eliminarLibro(Libro libro) {
        estanterias.remove(libro);
    }
    public List<Libro> obtenerLibros() {
        return estanterias;
    }

    @Override
    public String toString() {
        List<String> mensaje = new ArrayList<>(List.of("Libros en la biblioteca:"));
        estanterias.forEach(libro -> mensaje.add("\n" + libro.toString()));
        return mensaje.toString();
    }
}
