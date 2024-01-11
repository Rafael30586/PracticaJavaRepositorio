public class ClaseImplementadora implements InterfazDePrueba{
    @Override
    public void saludar(String saludo) {

    }

    @Override
    public String saludar(String saludo, String nombre) {
        return InterfazDePrueba.super.saludar(saludo, nombre);
    }
}
