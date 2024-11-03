package kotlinOPP.Biblioteca


import Java.Biblioteca.Bibliotecak
import Java.Biblioteca.Librok
import Java.Biblioteca.Usuariok


fun main() {

    val biblioteca = Bibliotecak()
    val libroPrueba = Librok("Librito", "Pepelu", "Sevilla", "12345")
    val libros = ArrayList<Librok>()
    val usuario = Usuariok("Fran", "Pollo", libros)

    println(biblioteca.agregarLibro(libroPrueba))
    println(biblioteca.agregarUsuario(usuario))
    println(biblioteca.prestarLibros("12345", usuario))

    println(libroPrueba.prestado)
}