package Java.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> Libros;

    ArrayList<Usuario> Usuarios;

    public Biblioteca() {
        Libros = new ArrayList<Libro>();
        Usuarios = new ArrayList<Usuario>();
    }

    public String agregarLibro(Libro libro) {
        Libros.add(libro);
        return "Libro agregado";
    }

    public String agregarUsuario(Usuario usuario) {
        Usuarios.add(usuario);
        return "Usuario agregado";
    }

    public String prestarLibros(String ibs,Usuario usuario) {

        for (Libro libro : Libros) {
            if (libro.isbn == ibs){
                libro.prestado = true;
                usuario.Libros.add(libro);
                return "Libro prestado";
            }
        }

        return "Libro no prestado";
    }


}
