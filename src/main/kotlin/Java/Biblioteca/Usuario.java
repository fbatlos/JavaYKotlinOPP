package Java.Biblioteca;

import java.util.ArrayList;

public class Usuario {
    public String nombre;
    public String apellido;
    public ArrayList<Libro> Libros;

    public Usuario(String nombre, String apellido, ArrayList<Libro> Libros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Libros = Libros;
    }
}
