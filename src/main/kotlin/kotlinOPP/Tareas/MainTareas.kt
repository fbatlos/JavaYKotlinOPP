package kotlinOPP.Tareas

fun main() {
    // Crear un usuario
    val usuario = Usuario("Carlos")

    // Crear proyectos
    usuario.crearProyecto("Proyecto A")
    usuario.crearProyecto("Proyecto B")

    // Obtener un proyecto y agregar tareas
    val proyectoA = usuario.obtenerProyecto("Proyecto A")
    proyectoA?.let {
        it.agregarTarea(Tarea("Tarea 1"))
        it.agregarTarea(Tarea("Tarea 2"))
        it.mostrarTareas()

        // Marcar una tarea como completada
        it.marcarTareaComoCompletada("Tarea 1")
        it.mostrarTareas()
    }
}