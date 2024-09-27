package ClasesObjetos;
import java.util.ArrayList;

public class Biblioteca {
    // Atributos de la clase Biblioteca
    private ArrayList<Libro> libros;

    public Biblioteca(){
        this.libros = new ArrayList<>();
    }

    // Metedo para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    // Metodo para listar todos los libros de la biblioteca
    public void listarLibros(){
        if (libros.isEmpty()){
            System.out.println("No hay libros en la biblioteca");
        } else {
            for (Libro libro : libros){
                System.out.println(libro.obtenerInformacion());
            }
        }
    }
}
