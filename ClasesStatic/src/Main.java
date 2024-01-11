public class Main {
    public static void main(String[] args) {

        VideoJuego.Personaje personaje = new VideoJuego.Personaje();
        Consola.Control control = new Consola.Control();

        personaje.setNombre("Sonic");

        System.out.println(personaje.getNombre());

        System.out.println("Hello world!");
    }
}