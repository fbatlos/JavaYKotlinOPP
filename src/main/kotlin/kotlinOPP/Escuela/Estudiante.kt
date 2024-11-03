package kotlinOPP.Escuela

class Estudiante(val nombre: String) {
    private val cursos: MutableList<Curso> = mutableListOf()

    fun agregarCurso(curso: Curso) {
        cursos.add(curso)
        curso.agregarEstudiante(this)
    }

    fun calcularPromedio(): Double {
        var suma = 0.0
        var cantidad = 0
        for (curso in cursos) {
            suma += curso.getCalificacion(this)
            cantidad++
        }
        return if (cantidad > 0) suma / cantidad else 0.0
    }

    override fun toString(): String {
        return nombre
    }
}