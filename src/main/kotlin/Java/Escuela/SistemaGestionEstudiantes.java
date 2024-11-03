package Java.Escuela;

public class SistemaGestionEstudiantes {
    public static void main(String[] args) {
        // Crear profesores
        Profesor profesor1 = new Profesor("Juan Pérez");
        Profesor profesor2 = new Profesor("Ana Gómez");

        // Crear cursos
        Curso cursoMatematicas = new Curso("Matemáticas", profesor1);
        Curso cursoCiencias = new Curso("Ciencias", profesor2);

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Carlos López");
        Estudiante estudiante2 = new Estudiante("María Rodríguez");

        // Asignar cursos a estudiantes
        profesor1.asignarCurso(estudiante1, cursoMatematicas);
        profesor2.asignarCurso(estudiante1, cursoCiencias);
        profesor1.asignarCurso(estudiante2, cursoMatematicas);

        // Asignar calificaciones
        profesor1.calificarEstudiante(cursoMatematicas, estudiante1, 85);
        profesor2.calificarEstudiante(cursoCiencias, estudiante1, 90);
        profesor1.calificarEstudiante(cursoMatematicas, estudiante2, 78);

        // Calcular y mostrar promedios
        System.out.println("Promedio de " + estudiante1.getNombre() + ": " + estudiante1.calcularPromedio());
        System.out.println("Promedio de " + estudiante2.getNombre() + ": " + estudiante2.calcularPromedio());
    }
}
