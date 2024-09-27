package ClasesObjetos;

public class Persona {
    // Atributos de la clase Persona
    private String nombre;
    private int edad;
    private String profesion;

    // Constructor de la clase Persona
    public Persona(String nombres, int edad, String profesion){
        this.nombre = nombres;
        this.edad = edad;
        this.profesion = profesion;
    }

    // Método para mostrar la informacion de la Persona
    public void mostrarInformacion(){
        System.out.println("Nombres: " + this.nombre + " Edad: " + this.edad);
    }

    // Método para saludar
    public void saludar(){
        if (this.edad > 1 ) {
            System.out.println("Hola, me llamo " + this.nombre + " y tengo " + this.edad + " años");
        } else {
            System.out.println("Hola, me llamo " + this.nombre + " y tengo " + this.edad + " año");
        }
    }

    // Método trabajar
    public void trabajar(){
        System.out.println("Mi nombres es " + this.nombre + " y trabajo de " + this.profesion);
    }
}