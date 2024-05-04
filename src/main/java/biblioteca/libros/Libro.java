package biblioteca.libros;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    private String categoria;
    private int ejemplaresDisponibles;
    private List<Integer> calificaciones;
    private List<String> comentarios;

    public Libro(String titulo, String autor, String categoria, int ejemplaresDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
        this.calificaciones = new ArrayList<>();
        this.comentarios = new ArrayList<>();
    }
    public void agregarComentario(String comentario) {
        comentarios.add(comentario);
    }
    public void agregarCalificacion(int calificacion) {
        calificaciones.add(calificacion);
    }
    public void prestar() {
        ejemplaresDisponibles--;
    }
    public void devolver() {
        ejemplaresDisponibles++;
    }
    public void  agregarEjemplares(int cantidad) {
        ejemplaresDisponibles += cantidad;
    }
    public void eliminarEjemplares(int cantidad) {
        ejemplaresDisponibles -= cantidad;
    }
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                ", ejemplaresDisponibles=" + ejemplaresDisponibles +
                ", calificaciones=" + calificaciones +
                ", comentarios=" + comentarios +
                '}';
    }

    public List<Integer> getCalificaciones() {
        return calificaciones;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
