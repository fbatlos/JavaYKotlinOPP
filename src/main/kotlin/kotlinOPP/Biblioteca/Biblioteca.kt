package Java.Biblioteca

class Bibliotecak {
    var Libros: ArrayList<Librok> = ArrayList()

    var Usuarios: ArrayList<Usuariok> = ArrayList()

    fun agregarLibro(librok: Librok): String {
        Libros.add(librok)

        return "Libro agregado"
    }

    fun agregarUsuario(usuario: Usuariok): String {
        Usuarios.add(usuario)
        return "Usuario agregado"
    }

    fun prestarLibros(ibs: String, usuariok: Usuariok): String {
        for (librok in Libros) {
            if (librok.isbn === ibs) {
                librok.prestado = true
                usuariok.Libros.add(librok)
                return "Libro prestado"
            }
        }

        return "Libro no prestado"
    }
}