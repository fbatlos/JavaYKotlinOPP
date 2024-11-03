package kotlinOPP.Tareas

class Usuario(val nombre: String) {
    private val proyectos: MutableList<Proyecto> = mutableListOf()

    fun crearProyecto(nombreProyecto: String) {
        val nuevoProyecto = Proyecto(nombreProyecto)
        proyectos.add(nuevoProyecto)
        println("Proyecto '$nombreProyecto' creado por $nombre.")
    }

    fun obtenerProyecto(nombreProyecto: String): Proyecto? {
        return proyectos.find { it.nombre == nombreProyecto }
            ?.also { println("Proyecto '$nombreProyecto' encontrado.") }
            ?: run { println("Proyecto '$nombreProyecto' no encontrado."); null }
    }
}