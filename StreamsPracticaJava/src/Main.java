import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Croacia");
        paises.add("Argentina");
        paises.add("Italia");
        paises.add("Etiopia");
        paises.add("Argelia");
        paises.add("Estados Unidos");
        paises.add("Francia");
        paises.add("Sudafrica");
        paises.add("China");
        paises.add("Tailandia");
        paises.add("Polonia");
        paises.add("Escocia");

        //paises.stream().forEach(c -> System.out.println(c)); funciona!

        System.out.println("------------------------------------------------");

        paises.stream().forEach(p -> mostrarPaises(p));

        ArrayList<Consola> consolas = new ArrayList<>();

        consolas.add(new Consola("Xbox 360","Microsoft"));
        consolas.add(new Consola("Playstation 2","Sony"));
        consolas.add(new Consola("Switch","Nintendo"));
        consolas.add(new Consola("Dreamcast","Sega"));
        consolas.add(new Consola("Gameboy advance","Nintendo"));
        consolas.add(new Consola("Xbox one","Microsoft"));
        consolas.add(new Consola("Playstation","Sony"));
        consolas.add(new Consola("Genesis","Sega"));

        System.out.println("------------------------------------------------");

        consolas.stream().forEach(c -> c.mostrarConsola());

        System.out.println("------------------------------------------------");

        consolas.stream()
                .filter( c -> c.getMarca().equals("Sega"))
                .forEach(c -> System.out.println(c.getNombre()));


        System.out.println("Hello world!");
    }
}