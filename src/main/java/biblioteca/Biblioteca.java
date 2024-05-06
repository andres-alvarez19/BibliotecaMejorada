package biblioteca.libros;

import biblioteca.usuarios.Usuario;
public class Biblioteca {
    public void prestarLibro(Libro libro, Usuario usuario) {
        if(libro.getEjemplaresDisponibles() == 0) {
            throw new IllegalArgumentException("No hay ejemplares disponibles");
        }else {
            usuario.realizarReserva(libro);
            libro.prestar();
        }
    }
    public void quitarReserva(Libro libro, Usuario usuario) {
        if(!usuario.getLibrosReservados().contains(libro)) {
            throw new IllegalArgumentException("El usuario no tiene este libro reservado");
        }else{
            usuario.devolverLibro(libro);
            libro.devolver();
        }
    }
}
