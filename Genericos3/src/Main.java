import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList();
        paises.add("Holanda");
        paises.add("Argentina");
        paises.add("Corea del sur");
        paises.add("Australia");
        paises.add("Etiopia");

        mostrarAlgo(paises);

        ArrayList<Color> colores = new ArrayList<>();
        colores.add(new Color(24,78,102));
        colores.add(new Color(123,90,4));
        colores.add(new Color(67,190,200));
        colores.add(new Color(56,12,240));

        mostrarAlgo(colores);

        //System.out.println("Hello world!");
    }

    public static void mostrarAlgo(ArrayList<?> listita){
        System.out.println(listita);
    }
}