public class PersonaServicioImpl implements PersonaServicio{

    //Esta clase es la implementación de PersonaServicio

    @Override
    public void decirEdad(Persona persona) {
        System.out.println("La edad de "+persona.getNombre()+" es "+persona.getEdad());
    }
}
