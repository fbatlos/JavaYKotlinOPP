package Java.Tareas;

public class GestorDeTareas {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario = new Usuario("Carlos");

        // Crear proyectos
        usuario.crearProyecto("Proyecto A");
        usuario.crearProyecto("Proyecto B");

        // Obtener un proyecto y agregar tareas
        Proyecto proyectoA = usuario.obtenerProyecto("Proyecto A");
        if (proyectoA != null) {
            proyectoA.agregarTarea(new Tarea("Tarea 1"));
            proyectoA.agregarTarea(new Tarea("Tarea 2"));
            proyectoA.mostrarTareas();

            // Marcar una tarea como completada
            proyectoA.marcarTareaComoCompletada("Tarea 1");
            proyectoA.mostrarTareas();
        }
    }
}