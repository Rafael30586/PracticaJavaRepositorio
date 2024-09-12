import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        //Primera prueba
        Function<String,Integer> pruebaFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(pruebaFunction.apply("Astral chain"));

        //Segunda prueba
        Function<String,Integer> pruebaFunction2 = (String cadena) -> cadena.length();

        System.out.println(pruebaFunction2.apply("Fire emblem: three houses"));

    }
}