package ClasesObjetos;

public class Libro {
    private String Titulo;
    private String Autor;
    private int anioPublicacion;


    // Constructor de la clase libro
    public Libro(String Titulo, String Autor, int anioPublicacion){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Metodo para obtener la informacion del libro
    public String obtenerInformacion() {
        return "Titulo: " + this.Titulo + " Autor: " + this.Autor + " Año de publicacion: " + this.anioPublicacion;
    }
}
