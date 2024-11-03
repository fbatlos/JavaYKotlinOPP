package Java.Escuela;

import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private List<Curso> cursos;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        curso.agregarEstudiante(this);
    }

    public double calcularPromedio() {
        double suma = 0;
        int cantidad = 0;
        for (Curso curso : cursos) {
            suma += curso.getCalificacion(this);
            cantidad++;
        }
        return cantidad > 0 ? suma / cantidad : 0;
    }

    @Override
    public String toString() {
        return nombre;
    }
}