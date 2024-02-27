// CLase de Asministrativo
public class Administrativo extends Persona {
    public Administrativo(String nombre, String apellido, int edad, String genero) {
        super(nombre, apellido, edad, "Administrativo", genero);
    }

    @Override
    public void realizarActividad() {
        System.out.println(getNombre() + " está administrando.");
    }
}
