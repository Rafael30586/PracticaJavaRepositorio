public class Main {
    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicioImpl();
        PersonaServicio personaServicio2 = new PersonaServicioImpl2();


        personaServicio.decirEdad(new Persona("Federico",34));
        personaServicio2.decirEdad(new Persona("Marianela",30));

        //System.out.println("Hello world!");
    }
}