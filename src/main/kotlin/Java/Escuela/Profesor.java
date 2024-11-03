package Java.Escuela;

class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void asignarCurso(Estudiante estudiante, Curso curso) {
        estudiante.agregarCurso(curso);
    }

    public void calificarEstudiante(Curso curso, Estudiante estudiante, double calificacion) {
        curso.asignarCalificacion(estudiante, calificacion);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
