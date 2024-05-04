package biblioteca;

import biblioteca.libros.Libro;
import biblioteca.libros.Biblioteca;
import biblioteca.usuarios.Administrador;
import biblioteca.usuarios.Usuario;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Administrador administrador = new Administrador("Juan",biblioteca);
        Usuario usuario = new Usuario("Pedro", "Estudiante");
        Usuario usuario2 = new Usuario("Maria", "Profesor");
        Libro libro = new Libro("El principito", "Antoine de Saint-Exupéry", "Cuento", 2);
        Libro libro2 = new Libro("El señor de los anillos", "J.R.R. Tolkien", "Fantasia", 3);

        administrador.agregarUsuario(usuario);
        administrador.agregarUsuario(usuario2);
        administrador.agregarLibro(libro);
        administrador.agregarLibro(libro2);

        System.out.println(biblioteca);
        System.out.println(biblioteca.mostrarUsuarios());

        usuario.realizarReserva(libro);
        usuario.realizarReserva(libro2);
        usuario.agregarCalificacion(5,libro);
        libro.agregarComentario("Excelente libro");

        System.out.printf("Comentarios de libro %s : %s %n",libro.getTitulo(),libro.getComentarios());
        System.out.printf("Calificaciones de libro %s : %s %n",libro.getTitulo(),libro.getCalificaciones());
        System.out.printf("Libros reservados de %s son %s%n",usuario.getNombre(),usuario.getLibrosReservados());

        administrador.quitarReserva(usuario,libro);

        System.out.printf("Historial de prestamos de %s son %s%n",usuario.getNombre(),usuario.getHistorialPrestamos());
        System.out.printf("Libros reservados de %s son %s%n",usuario.getNombre(),usuario.getLibrosReservados());


    }
}