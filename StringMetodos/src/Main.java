import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String cadena = "Halo 3";
        String[] cadenas = {" Metroid fusion "," Final fantasy XII "," Sonic 2 "};
        String nada = "   ";
        String nothing = "";
        String barra = "|";
        ArrayList<String> juegos = new ArrayList<>();
        juegos.add("Super Mario bros 3");
        juegos.add("Street fighter II");
        juegos.add("TLoZ Ocarina of time");

        System.out.println("charAt: "+cadena.charAt(2));
        System.out.println("compareTo: "+cadena.compareTo("Halo 3"));
        System.out.println("concat: "+cadena.concat(" remake"));
        System.out.println("contains: "+cadena.contains("lo 3"));
        System.out.println("endsWith: "+cadena.endsWith("o 3"));
        System.out.println("format :"+String.format(cadena,cadenas)); //no se lo que hace
        //Hay otro String.format
        System.out.println("indent: "+cadena.indent(5));
        System.out.println("indexOf: "+cadena.indexOf(108)); //Le pase el codigo ascii como parametro
        System.out.println("indexOf: "+cadenas[1].indexOf(102,3)); //Codigo ascii + posicion...
        // ...desde donde yo quiero que empiece
        System.out.println("indexOf: "+cadena.indexOf("H")); //Toma un substring, no la cadena completa,...
        //...por eso es mejor pasarle un solo caracter
        System.out.println("intern: "+cadenas[2].intern());
        System.out.println("isBlank: "+nada.isBlank());
        System.out.println("isBlank: "+nothing.isBlank());
        System.out.println("isEmpty: "+nothing.isEmpty());
        System.out.println("join: "+String.join(barra,cadenas));
        System.out.println("join: "+String.join(barra,juegos));
        System.out.println("lastIndexOf: "+juegos.get(0).lastIndexOf('o'));
        System.out.println("lastIndexOf: "+juegos.get(0).lastIndexOf('o',13));
        //En los lastIndexOf() se puede hacer mas o menos lo mismo pero reemplazando el char por...
        //... un String (usara un subString)
        juegos.get(1).lines().forEach(j -> { //No se muy bien lo que hizo
            System.out.println(j);
        });
        System.out.println("replace: "+cadenas[1].replace('a','e'));
        System.out.println("replace: "+cadenas[1].replace("antas","mono"));
        System.out.println("split: "+cadenas[1].split("a"));
        String[] splits = cadenas[1].split("a"); //Arranca la letra a y guarda las partes...
        for(int i=0;i<splits.length;i++) {//...restantes en un array
            System.out.print(splits[i] + ",");
        }
        System.out.println(" ");
        System.out.println("startsWith: "+juegos.get(2).startsWith("TLo"));
        System.out.println("startsWith: "+juegos.get(1).startsWith("eet",3));
        System.out.println("Strip: "+cadenas[2].strip());
        System.out.println("StripIndent: "+cadenas[2].stripIndent());//no se muy la diferencia con el...
        //...anterior
        System.out.println("stripLeading:"+cadenas[1].stripLeading());//Saca el espacio vacio anterior...
        //...al texto
        System.out.println("stripLeading:"+cadenas[1].stripTrailing());//Saca el espacio vacio posterior...
        //...al texto


        //System.out.println("Hello world!");
    }
}