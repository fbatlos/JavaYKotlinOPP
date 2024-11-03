package kotlinOPP.Escuela

class Profesor(val nombre: String) {
    fun asignarCurso(estudiante: Estudiante, curso: Curso) {
        estudiante.agregarCurso(curso)
    }

    fun calificarEstudiante(curso: Curso, estudiante: Estudiante, calificacion: Double) {
        curso.asignarCalificacion(estudiante, calificacion)
    }

    override fun toString(): String {
        return nombre
    }
}