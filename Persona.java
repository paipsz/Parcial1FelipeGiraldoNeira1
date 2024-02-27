public class Persona {
    // Propiedades
    private String nombre;
    private String apellido;
    private int edad;
    private String ocupacion;
    private String genero;

    // Constructor
    public Persona(String nombre, String apellido, int edad, String ocupacion, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.genero = genero;
    }

    // Metodos
    public void hablar() {
        System.out.println(nombre + apellido +" está hablando.");
    }

    public String getNombre() {
        return nombre;
    }

    public void trabajar() {
        System.out.println(nombre + apellido +" está trabajando.");
    }

    public void realizarActividad() {
        System.out.println(nombre + apellido +" está realizando una actividad.");
    }
}
