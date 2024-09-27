package ClasesObjetos;

public class MainBiblioteca {
    public static void main(String[] args){
        // Crear una instancia de la clase Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear instancias de la clase Libro
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);
        Libro libro2 = new Libro("El alquimista", "Paulo Coelho", 1988);
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);

        // Agregar los libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        biblioteca.listarLibros();
    }
}
