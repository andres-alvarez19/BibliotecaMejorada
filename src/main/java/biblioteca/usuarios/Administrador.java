package biblioteca.usuarios;

import biblioteca.libros.Biblioteca;
import biblioteca.libros.Libro;

public class Administrador extends Persona {
    Biblioteca biblioteca ;
    public Administrador(String nombre, Biblioteca biblioteca) {
        super(nombre,"Personal de la biblioteca");
        this.biblioteca = biblioteca;
    }
    public void agregarLibro(Libro libro) {
        biblioteca.agregarLibro(libro);
    }
    public void eliminarLibro(Libro libro) {
        biblioteca.eliminarLibro(libro);
    }
    public void modificarLibro(Libro libro, String titulo) {
        libro.setTitulo(titulo);
    }
    public void agregarEjemplares(Libro libro, int cantidad) {
        libro.agregarEjemplares(cantidad);
    }
    public void eliminarEjemplares(Libro libro, int cantidad) {
        libro.eliminarEjemplares(cantidad);
    }
    public void quitarReserva(Usuario usuario, Libro libro) {
        usuario.getLibrosReservados().remove(libro);
        libro.devolver();
    }
    public void agregarUsuario(Usuario usuario) {
        biblioteca.agregarUsuario(usuario);
    }
    public void eliminarUsuario(Usuario usuario) {
        biblioteca.eliminarUsuario(usuario);
    }
    public void modificarUsuario(Usuario usuario, String nombre) {
        usuario.setNombre(nombre);
    }
}