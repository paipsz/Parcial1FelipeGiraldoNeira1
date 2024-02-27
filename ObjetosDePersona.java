public class ObjetosDePersona {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Felipe", "Giraldo", 19, "Masculino");
        Docente docente = new Docente("Diego", "Cruzo", 44, "Masculino");
        Administrativo administrativo = new Administrativo("Rosa", "Melano", 69, "Helicoptero");
        Servicio servicio = new Servicio("Juanita","Zeballos",38,"Femenino");

        estudiante.realizarActividad();
        docente.realizarActividad();
        administrativo.realizarActividad();
        servicio.realizarActividad();
    }
}
