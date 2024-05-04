package biblioteca.libros;
import biblioteca.usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Libro> estanterias;
    List<Usuario> usuarios;
    public Biblioteca() {
        this.estanterias = new ArrayList<>();
        this.usuarios = new ArrayList<>();
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

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }
    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }
    public String mostrarUsuarios() {
        List<String> mensaje = new ArrayList<>(List.of("Usuarios en la biblioteca:"));
        usuarios.forEach(usuario -> mensaje.add("\n" + usuario.toString()));
        return mensaje.toString();
    }
}
