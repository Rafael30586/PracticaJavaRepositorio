import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Pato");
        palabras.add("Auto");
        palabras.add("Cielo");
        palabras.add("Sol");
        palabras.add("Canilla");

        palabras.forEach(p -> System.out.println(p.toUpperCase()));
        System.out.println("------------------------------------------------");

        palabras.forEach(p -> System.out.println("Es un/a "+p));
        System.out.println("------------------------------------------------");

        palabras.forEach(p -> {
            System.out.println(p+" azul");
            System.out.println(p+" rojo");
            System.out.println(p.toLowerCase());
        });
        /*
        palabras.forEach(p->{
            p = p + " azul";
            return p;
        })->System.out.println();*/




        //System.out.println("Hello world!");
    }
}