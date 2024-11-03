package kotlinOPP.Rol

class Guerrero(nombre: String) : Personaje(nombre, 100) {
    override fun atacar(): Int {
        val danio = (10..20).random() // Daño aleatorio entre 10 y 20
        println("$nombre ataca y causa $danio de daño.")
        return danio
    }

    override fun recibirDanio(danio: Int) {
        puntosDeVida -= danio
        println("$nombre recibe $danio de daño. Puntos de vida restantes: $puntosDeVida")
    }
}