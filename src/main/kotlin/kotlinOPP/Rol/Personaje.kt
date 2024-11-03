package kotlinOPP.Rol

abstract class Personaje(val nombre: String, var puntosDeVida: Int) {
    abstract fun atacar(): Int
    abstract fun recibirDanio(danio: Int)
}