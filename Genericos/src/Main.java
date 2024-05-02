public class Main {
    public static void main(String[] args) {
        ClaseGenerica<String> cadenas = new ClaseGenerica<>();

        cadenas.add("Mario");

        System.out.println(cadenas.get(0));

        //System.out.println("Hello world!");
    }
}