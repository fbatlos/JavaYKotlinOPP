package kotlinOPP.Tareas

data class Tarea(val nombre: String, var completada: Boolean = false) {
    fun marcarComoCompletada() {
        completada = true
        println("La tarea '$nombre' ha sido marcada como completada.")
    }

    override fun toString(): String {
        return "$nombre (estado: ${if (completada) "completada" else "pendiente"})"
    }
}