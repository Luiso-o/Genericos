package n2ejercicio1;

public class Persona {

    private final String nombre;
    private final String apellido;
    private final int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", edad " + edad + " años";
    }
}
