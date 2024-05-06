package biblioteca.usuarios;

import biblioteca.libros.GestorLibro;

public class Administrador extends Persona {
    GestorUsuario gestorUsuario;
    GestorLibro gestorLibro;

    public Administrador(String nombre, GestorUsuario gestorUsuario, GestorLibro gestorLibro) {
        super(nombre, "Administrador");
        this.gestorUsuario = gestorUsuario;
        this.gestorLibro = gestorLibro;
    }
}