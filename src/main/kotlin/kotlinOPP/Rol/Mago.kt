package kotlinOPP.Rol

class Mago(nombre: String) : Personaje(nombre, 80) {
    private val hechizos = listOf(
        Hechizo("Bola de Fuego", 15),
        Hechizo("Rayo", 25)
    )

    override fun atacar(): Int {
        val hechizo = hechizos.random()
        println("$nombre lanza ${hechizo.nombre} y causa ${hechizo.danio} de daño.")
        return hechizo.danio
    }

    override fun recibirDanio(danio: Int) {
        puntosDeVida -= danio
        println("$nombre recibe $danio de daño. Puntos de vida restantes: $puntosDeVida")
    }
}