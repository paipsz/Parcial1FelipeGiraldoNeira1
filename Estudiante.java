//Clase Estudiante :)
public class Estudiante extends Persona {
    public Estudiante(String nombre, String apellido, int edad, String genero) {
        super(nombre, apellido, edad, "Estudiante", genero);
    }

    @Override
    public void realizarActividad() {
        System.out.println(getNombre() + " está estudiando.");
    }
}
