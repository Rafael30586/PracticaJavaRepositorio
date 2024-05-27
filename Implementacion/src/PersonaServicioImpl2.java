public class PersonaServicioImpl2 implements PersonaServicio{

    //Esta es otra implementación de PersonaServicio
    @Override
    public void decirEdad(Persona persona) {
        System.out.println(persona.getNombre()+" tiene "+persona.getEdad()+" años");
    }
}
