//Clase de Profes; Deme un 5, mil gracias
public class Docente extends Persona {
    public Docente(String nombre, String apellido, int edad, String genero) {
        super(nombre, apellido, edad, "Docente", genero);
    }

    @Override
    public void realizarActividad() {
        System.out.println(getNombre() + " está enseñando.");
    }
}
