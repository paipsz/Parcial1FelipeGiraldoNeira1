public class Servicio extends Persona {
    public Servicio(String nombre, String apellido, int edad, String genero) {
        super(nombre, apellido, edad, "Servicio", genero);
    }

    @Override
    public void realizarActividad() {
        System.out.println(getNombre() + " está trabajando.");
    }
}
