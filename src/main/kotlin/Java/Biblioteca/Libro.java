package Java.Biblioteca;

public class Libro {
    public String titulo;
    public String autor;
    public String editora;
    public String isbn;
    public Boolean prestado = false;

    public Libro(String titulo, String autor, String editora, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
    }
}
