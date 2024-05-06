package biblioteca;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Biblioteca {
    private Map<Usuario,Fecha> prestamos;
    public Biblioteca() {
        this.prestamos = new HashMap<>();
    }
    public void prestarLibro(Libro libro, Usuario usuario) {
        if(libro.getEjemplaresDisponibles() == 0) {
            throw new IllegalArgumentException("No hay ejemplares disponibles");
        }else {
            usuario.realizarReserva(libro);
            libro.prestar();
            prestamos.put(usuario, new Fecha(LocalDate.now().plusDays(15)));
        }
    }
    public void estadoPrestamo(Usuario usuario) {
        if(prestamos.get(usuario).fecha().isBefore(LocalDate.now().minusDays(15))) {
            quitarReserva(usuario, usuario.getLibrosReservados().getFirst());
            throw new IllegalArgumentException("El usuario tiene un prestamo vencido");
        }else {
            Logger logger = Logger.getLogger(Biblioteca.class.getName());
            logger.info("El usuario tiene un prestamo vigente hasta " + prestamos.get(usuario).fecha());
        }
    }
    public void quitarReserva( Usuario usuario,Libro libro) {
        usuario.devolverLibro(libro);
        libro.devolver();
    }
}
