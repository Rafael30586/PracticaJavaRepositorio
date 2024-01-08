import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<VideoJuego> juegos = new ArrayList<>();
        juegos.add(new VideoJuego("Metroid Prime 3",new Marca("Retro Studios")));
        juegos.add(new VideoJuego("Banjo Kazooie",new Marca("Rare")));
        juegos.add(new VideoJuego("Super Mario bros 3",new Marca("Nintendo")));
        juegos.add(new VideoJuego("Halo combat evolved",new Marca("Bungie")));
        juegos.add(new VideoJuego("Gears of war",new Marca("Epic")));
        juegos.add(new VideoJuego("Final fantasy VII",new Marca("Square soft")));
        juegos.add(new VideoJuego("TLOZ Ocarina of time",new Marca("Nintendo")));
        juegos.add(new VideoJuego("Sonic the hedgehog 2",new Marca("Sega")));
        juegos.add(new VideoJuego("Chrono cross",new Marca("Square soft")));
        juegos.add(new VideoJuego("TES V Skyrim",new Marca("Bethesda")));
        juegos.add(new VideoJuego("Mass effect 2",new Marca("Bioware")));
        juegos.add(new VideoJuego("Street fighter II",new Marca("Capcom")));


        Long comienzo6 = System.nanoTime();
        juegos.stream().parallel().forEach(juego -> System.out.println(juego.getDesarrollador().getNombre()));
        Long fin6 = System.nanoTime();
        System.out.println("Diferencia stream con for each y parallel: "+(fin6 - comienzo6)+" ms");


        Long comienzo = System.nanoTime();
        for(int i = 0;i<juegos.size();i++){ //1374832 ms
            System.out.println(juegos.get(i).getDesarrollador().getNombre());
        }
        Long fin = System.nanoTime();
        System.out.println("Diferencia for normal: "+(fin - comienzo)+" ms");

        Long comienzo2 = System.nanoTime(); //1368138 ms
        for(VideoJuego juego : juegos){
            System.out.println(juego.getDesarrollador().getNombre());
        }
        Long fin2 = System.nanoTime();
        System.out.println("Diferencia for each: "+(fin2 - comienzo2)+" ms");

        Long comienzo3 = System.nanoTime();
        for(int i = 0;i<juegos.size();i++){
            System.out.println(juegos.get(i).getDesarrollador().getNombre());
        }
        Long fin3 = System.nanoTime();
        System.out.println("Diferencia for normal (2): "+(fin3 - comienzo3)+" ms");

        Long comienzo4 = System.nanoTime();
        for(VideoJuego juego : juegos){
            System.out.println(juego.getDesarrollador().getNombre());
        }
        Long fin4 = System.nanoTime();
        System.out.println("Diferencia for each (2): "+(fin4 - comienzo4)+" ms");

        Long comienzo5 = System.nanoTime();
        juegos.stream().forEach(juego -> System.out.println(juego.getDesarrollador().getNombre()));
        Long fin5 = System.nanoTime();
        System.out.println("Diferencia stream con for each: "+(fin5 - comienzo5)+" ms");


        //System.out.println("Hello world!");
    }
}