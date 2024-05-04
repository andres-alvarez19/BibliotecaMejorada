import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("El principito",
                "Antoine de Saint-Exupéry",
                "Cuentos",
                10);
        Libro libro2 = new Libro("El señor de los anillos",
                "J.R.R. Tolkien",
                "Fantasía",
                5);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        System.out.println(biblioteca.toString()+"\n");
        Administrador admin = new Administrador("Juan");
        Usuario usuario = new Usuario("Pedro","Estudiante");
        usuario.realizarReserva(libro1);
        System.out.println("Libros reservados por " +
                usuario.getNombre() + ": " +
                usuario.getLibrosReservados());
        System.out.println("Historial de prestamos "+
                usuario.getNombre() + ": " +
                usuario.getHistorialPrestamos().toString());
        System.out.println("Ejemplares disponibles "+libro1.getEjemplaresDisponibles());
        System.out.println("Realizando reserva de "+usuario.getNombre()+
                " de "+libro2.getTitulo());
        usuario.realizarReserva(libro2);
        System.out.println("Libros reservados"+usuario.getLibrosReservados().toString());
        System.out.println("Quitando reserva de "+usuario.getNombre()+
                " de "+libro1.getTitulo());
        admin.quitarReserva(usuario,libro1);
        System.out.println("Libros reservados"+usuario.getLibrosReservados().toString());
        System.out.println("Historial de prestamos"+usuario.getHistorialPrestamos().toString()+"\n");
        System.out.println("Ejemplares disponibles "+libro1.getEjemplaresDisponibles());

        usuario.agregarCalificacion(5);
        usuario.agregarCalificacion(3);
        libro2.agregarCalificacion(4);
        libro2.agregarCalificacion(5);
        System.out.println("Calificaciones de usuario"+usuario.getCalificaciones().toString());
        System.out.println("Calificaciones de libro"+libro2.getCalificaciones().toString());

        libro2.agregarComentario("Me encanto este libro");
        System.out.println("Comentarios de libro "+libro2.getTitulo()
                +libro2.getComentarios().toString()+"\n");

        System.out.println("Eliminando libro "+libro2.getTitulo());
        biblioteca.eliminarLibro(libro2);
        System.out.println(biblioteca.toString());
    }
}