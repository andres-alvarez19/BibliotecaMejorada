import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona implements Calificar {
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
        if(libro.getEjemplaresDisponibles() == 0) {
            System.out.println("No hay ejemplares disponibles");
        }else {
            librosReservados.add(libro);
            agregarPrestamo(libro);
            libro.prestar();
        }
    }

    public void agregarCalificacion(int calificacion) {
        calificaciones.add(calificacion);
    }

    public List<Libro> getHistorialPrestamos() {
        return historialPrestamos;
    }
    public List<Libro> getLibrosReservados() {
        return librosReservados;
    }

    public List<Integer> getCalificaciones() {
        return calificaciones;
    }
}
