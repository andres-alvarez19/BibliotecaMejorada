package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Libro extends Valoracion implements Comentario {
    private String titulo;
    private final String autor;
    private final String categoria;
    private int ejemplaresDisponibles;
    private List<String> comentarios;

    public Libro(String titulo, String autor, String categoria, int ejemplaresDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
        this.comentarios = new ArrayList<>();
    }
    public void agregarComentario(String comentario) {
        comentarios.add(comentario);
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
                ", calificaciones=" + getCalificaciones() +
                ", comentarios=" + comentarios +
                '}';
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
