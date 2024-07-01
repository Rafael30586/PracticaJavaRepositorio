import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Argentina");
        paises.add("Rusia");
        paises.add("Costa de Marfil");
        paises.add("Nepal");
        paises.add("Holanda");

        paises.stream().map(pais -> new StringBuilder(pais));

        ArrayList<String> personajes = new ArrayList<>();
        personajes.add("Sonic");
        personajes.add("Cloud");
        personajes.add("Mario");
        personajes.add("Master chief");
        personajes.add("Link");

        personajes.stream().map(p -> new Personaje(p)).forEach(p->{System.out.println(p);});

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(45);
        numeros.add(12);
        numeros.add(65);
        numeros.add(91);
        numeros.add(20);

        numeros.stream().map(n->n+15).forEach(n->{System.out.println(n);});

        //System.out.println("Hello world!");
    }
}