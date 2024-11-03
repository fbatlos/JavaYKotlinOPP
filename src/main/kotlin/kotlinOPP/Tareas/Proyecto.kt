package kotlinOPP.Tareas

class Proyecto(val nombre: String) {
    private val tareas: MutableList<Tarea> = mutableListOf()

    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
        println("Tarea '$nombre' añadida al proyecto '$nombre'.")
    }

    fun mostrarTareas() {
        println("Tareas del proyecto '$nombre':")
        if (tareas.isEmpty()) {
            println("No hay tareas en este proyecto.")
        } else {
            tareas.forEach { println("- $it") }
        }
    }

    fun marcarTareaComoCompletada(nombreTarea: String) {
        val tarea = tareas.find { it.nombre == nombreTarea }
        tarea?.marcarComoCompletada() ?: println("Tarea '$nombreTarea' no encontrada.")
    }
}