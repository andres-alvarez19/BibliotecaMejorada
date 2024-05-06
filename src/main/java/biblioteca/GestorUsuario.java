package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class GestorUsuario {
    List<Usuario> usuarios;

    public GestorUsuario() {
        this.usuarios = new ArrayList<>();
    }
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }
    public void modificarUsuario(Usuario usuario, String nombre) {
        usuario.setNombre(nombre);
    }
    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }

    public String mostrarUsuarios() {
        return "GestorUsuario{" +
                "usuarios=" + usuarios.toString() +
                '}';
    }
}
