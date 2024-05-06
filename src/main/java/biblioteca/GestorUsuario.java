package biblioteca.usuarios;

import java.util.List;

public class GestorUsuario {
    List<Usuario> usuarios;
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
}
