import Java.Biblioteca.Biblioteca;
import Java.Biblioteca.Libro;
import Java.Biblioteca.Usuario;

import java.util.Scanner;

public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    Libro libroPrueba = new Libro("Librito","Pepelu","Sevilla","12345");
    Usuario usuario = new Usuario("Fran","Pollo",null);

    Scanner sc = new Scanner(System.in);

    biblioteca.agregarLibro(libroPrueba);
    biblioteca.agregarUsuario(usuario);
    biblioteca.prestarLibros("12345",usuario);


}
