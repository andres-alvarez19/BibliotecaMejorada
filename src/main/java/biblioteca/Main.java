package biblioteca;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        String mensajeLog ;
        Biblioteca biblioteca = new Biblioteca();
        GestorUsuario gestorUsuario = new GestorUsuario();
        GestorLibro gestorLibro = new GestorLibro();
        Administrador administrador = new Administrador(gestorUsuario, gestorLibro);
        Usuario usuario = new Usuario("Pedro", "Estudiante");
        Usuario usuario2 = new Usuario("Maria", "Profesor");
        Libro libro = new Libro("El principito", "Antoine de Saint-Exupéry", "Cuento", 2);
        Libro libro2 = new Libro("El señor de los anillos", "J.R.R. Tolkien", "Fantasia", 3);

        administrador.gestorUsuario.agregarUsuario(usuario);
        administrador.gestorUsuario.agregarUsuario(usuario2);
        administrador.gestorLibro.agregarLibro(libro);
        administrador.gestorLibro.agregarLibro(libro2);

        mensajeLog = administrador.gestorLibro.obtenerLibros().toString();
        logger.info(mensajeLog);
        mensajeLog = administrador.gestorUsuario.mostrarUsuarios();
        logger.info(mensajeLog);

        biblioteca.prestarLibro(libro, usuario);
        biblioteca.prestarLibro(libro2, usuario2);

        usuario.agregarCalificacion(5);
        libro.agregarCalificacion(1);
        libro.agregarComentario("Excelente libro");

        mensajeLog = "Comentarios de libro " + libro.getTitulo() + " : " + libro.getComentarios();
        logger.info(mensajeLog);
        mensajeLog = "Calificaciones de libro " + libro.getTitulo() + " : " + libro.getCalificaciones();
        logger.info(mensajeLog);
        mensajeLog = "Libros reservados de " + usuario.getNombre() + " son " + usuario.getLibrosReservados();
        logger.info(mensajeLog);

        biblioteca.estadoPrestamo(usuario);

        mensajeLog = "Historial de prestamos de " + usuario.getNombre() + " " + usuario.getHistorialPrestamos();
        logger.info(mensajeLog);
        mensajeLog = "Libros reservados de " + usuario.getNombre() + " es " + usuario.getLibrosReservados();
        logger.info(mensajeLog);
    }
}