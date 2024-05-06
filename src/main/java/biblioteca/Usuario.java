package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Valoracion {
    private String nombre;
    private String tipo;
    private List<Libro> historialPrestamos;
    private List<Libro> librosReservados;

    public Usuario(String nombre, String tipo) {
        super();
        this.nombre = nombre;
        this.tipo = tipo;
        this.historialPrestamos = new ArrayList<>();
        this.librosReservados = new ArrayList<>();
    }

    private void agregarPrestamo(Libro libro) {
        historialPrestamos.add(libro);
    }

    public void realizarReserva(Libro libro) {
        librosReservados.add(libro);
        agregarPrestamo(libro);
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
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return getNombre()+ " {" +
                "tipo = " + getTipo() +
                "historialPrestamos=" + historialPrestamos +
                ", librosReservados=" + librosReservados +
                ", calificaciones=" + super.getCalificaciones() +
                '}';
    }
}
