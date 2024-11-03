package kotlinOPP.Escuela

fun main() {
    // Crear profesores
    val profesor1 = Profesor("Juan Pérez")
    val profesor2 = Profesor("Ana Gómez")

    // Crear cursos
    val cursoMatematicas = Curso("Matemáticas", profesor1)
    val cursoCiencias = Curso("Ciencias", profesor2)

    // Crear estudiantes
    val estudiante1 = Estudiante("Carlos López")
    val estudiante2 = Estudiante("María Rodríguez")

    // Asignar cursos a estudiantes
    profesor1.asignarCurso(estudiante1, cursoMatematicas)
    profesor2.asignarCurso(estudiante1, cursoCiencias)
    profesor1.asignarCurso(estudiante2, cursoMatematicas)

    // Asignar calificaciones
    profesor1.calificarEstudiante(cursoMatematicas, estudiante1, 85.0)
    profesor2.calificarEstudiante(cursoCiencias, estudiante1, 90.0)
    profesor1.calificarEstudiante(cursoMatematicas, estudiante2, 78.0)

    // Calcular y mostrar promedios
    println("Promedio de ${estudiante1.nombre}: ${estudiante1.calcularPromedio()}")
    println("Promedio de ${estudiante2.nombre}: ${estudiante2.calcularPromedio()}")
}