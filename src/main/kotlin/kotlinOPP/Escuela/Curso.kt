package kotlinOPP.Escuela

class Curso(val nombre: String, val profesor: Profesor) {
    private val calificaciones: MutableMap<Estudiante, Double> = mutableMapOf()

    fun agregarEstudiante(estudiante: Estudiante) {
        calificaciones[estudiante] = 0.0 // Inicializa la calificación en 0
    }

    fun asignarCalificacion(estudiante: Estudiante, calificacion: Double) {
        if (calificaciones.containsKey(estudiante)) {
            calificaciones[estudiante] = calificacion
        } else {
            println("Estudiante no está inscrito en el curso.")
        }
    }

    fun getCalificacion(estudiante: Estudiante): Double {
        return calificaciones[estudiante] ?: 0.0
    }

    override fun toString(): String {
        return nombre
    }
}