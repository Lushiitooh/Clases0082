package m4s17.ejercicio2.model;

public class Libro {
    private String titulo;
    private String autor;
    private String generoLiterario;

    public Libro(String titulo, String autor, String generoLiterario) {
        this.titulo = titulo;
        this.autor = autor;
        this.generoLiterario = generoLiterario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    @Override
    public String toString() {
        return  "titulo del libro es " + titulo + '\'' +
                ", pertenece al autor " + autor + '\'' +
                ", de genero literario " + generoLiterario;
    }
}
