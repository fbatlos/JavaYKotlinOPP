package kotlinOPP.Rol

fun main() {
    val guerrero = Guerrero("Thor")
    val mago = Mago("Merlin")

    // Simulación de combate
    while (guerrero.puntosDeVida > 0 && mago.puntosDeVida > 0) {
        val danioGuerrero = guerrero.atacar()
        mago.recibirDanio(danioGuerrero)

        if (mago.puntosDeVida <= 0) {
            println("${mago.nombre} ha sido derrotado.")
            break
        }

        val danioMago = mago.atacar()
        guerrero.recibirDanio(danioMago)

        if (guerrero.puntosDeVida <= 0) {
            println("${guerrero.nombre} ha sido derrotado.")
            break
        }
    }
}