package ClasesObjetos;

public class MainPersona {
    public static void main(String[] args) {
        // Crear objetos de la clase
        Persona persona1 = new Persona("Juan", 25, "Ingeniero");
        Persona persona2 = new Persona("Luis", 1, "chef");
        Persona persona3 = new Persona("Gabriel", 32, "Bombero");

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();

        persona1.saludar();
        persona2.saludar();

        persona3.trabajar();
    }
}