public class Main {
    public static void main(String[] args) {

        String cadena = "Halo 3";
        String[] cadenas = {" Metroid fusion "," Final fantasy XII "," Sonic 2 "};

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

        //System.out.println("Hello world!");
    }
}