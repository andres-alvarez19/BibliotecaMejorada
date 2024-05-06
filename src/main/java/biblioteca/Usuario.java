package biblioteca.usuarios;

import biblioteca.libros.Libro;
import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
    private List<Libro> historialPrestamos;
    private List<Libro> librosReservados;
    private List<Integer> calificaciones;

    public Usuario(String nombre, String tipo) {
        super(nombre, tipo);
        this.historialPrestamos = new ArrayList<>();
        this.librosReservados = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
    }

    private void agregarPrestamo(Libro libro) {
        historialPrestamos.add(libro);
    }

    public void realizarReserva(Libro libro) {
        librosReservados.add(libro);
        agregarPrestamo(libro);
    }

    public void agregarCalificacion(int calificacion, Libro libro) {
        libro.agregarCalificacion(calificacion);
        calificaciones.add(calificacion);
    }

    public List<Libro> getHistorialPrestamos() {
        return historialPrestamos;
    }
    public void devolverLibro(Libro libro) {
        librosReservados.remove(libro);
    }
    public List<Libro> getLibrosReservados() {
        return librosReservados;
    }
    @Override
    public String toString() {
        return getNombre()+ " {" +
                "tipo = " + getTipo() +
                "historialPrestamos=" + historialPrestamos +
                ", librosReservados=" + librosReservados +
                ", calificaciones=" + calificaciones +
                '}';
    }
}
