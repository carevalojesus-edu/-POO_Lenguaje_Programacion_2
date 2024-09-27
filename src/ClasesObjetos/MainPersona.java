package ClasesObjetos;

public class MainPersona {
    public static void main(String[] args) {
        // Crear objetos de la clase
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Luis", 1);

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();

        persona1.saludar();
        persona2.saludar();
    }
}