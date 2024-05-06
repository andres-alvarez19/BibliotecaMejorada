package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Valoracion {
    private List<Integer> calificaciones;

    public Valoracion() {
        this.calificaciones = new ArrayList<>();
    }
    public void agregarCalificacion(int calificacion) {
        calificaciones.add(calificacion);
    }

    public List<Integer> getCalificaciones() {
        return calificaciones;
    }
}
