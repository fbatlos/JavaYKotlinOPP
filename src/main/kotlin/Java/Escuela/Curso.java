package Java.Escuela;

import java.util.HashMap;
import java.util.Map;

class Curso {
    private String nombre;
    private Profesor profesor;
    private Map<Estudiante, Double> calificaciones;

    public Curso(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.calificaciones = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        calificaciones.put(estudiante, 0.0); // Inicializa la calificación en 0
    }

    public void asignarCalificacion(Estudiante estudiante, double calificacion) {
        if (calificaciones.containsKey(estudiante)) {
            calificaciones.put(estudiante, calificacion);
        } else {
            System.out.println("Estudiante no está inscrito en el curso.");
        }
    }

    public double getCalificacion(Estudiante estudiante) {
        return calificaciones.getOrDefault(estudiante, 0.0);
    }

    @Override
    public String toString() {
        return nombre;
    }
}

