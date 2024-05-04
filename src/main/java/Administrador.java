public class Administrador extends Persona {
    public Administrador(String nombre) {
        super(nombre,"Personal de la biblioteca");
    }
    public void quitarReserva(Usuario usuario, Libro libro) {
        usuario.getLibrosReservados().remove(libro);
        libro.devolver();
    }
}