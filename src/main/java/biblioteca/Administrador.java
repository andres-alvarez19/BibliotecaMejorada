package biblioteca;

public class Administrador {
    private GestorUsuario gestorUsuario;
    private GestorLibro gestorLibro;

    public Administrador(GestorUsuario gestorUsuario, GestorLibro gestorLibro) {
        this.gestorUsuario = gestorUsuario;
        this.gestorLibro = gestorLibro;
    }

    public GestorUsuario getGestorUsuario() {
        return gestorUsuario;
    }
    public GestorLibro getGestorLibro() {
        return gestorLibro;
    }
}