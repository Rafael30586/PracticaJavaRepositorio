public class Main {
    public static void main(String[] args) {

        VideoJuego.Personaje personaje = new VideoJuego.Personaje();
        VideoJuego.Personaje personaje1 = new VideoJuego.Personaje();

        personaje.setNombre("Sonic");
        personaje1.setNombre("Mario");

        System.out.println(personaje.getNombre());
        System.out.println(personaje1.getNombre());

        //System.out.println("Hello world!");
    }
}