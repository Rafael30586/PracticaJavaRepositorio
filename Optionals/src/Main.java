import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<String> cadenita;

        Auto a = new Auto();

        System.out.println(a.devolverCadena("Hola amigos"));
        System.out.println(a.devolverCadena("Hola amigos").get());
        System.out.println(a.devolverCadena("Hola"));
        //System.out.println(a.devolverCadena("Hola").get()); NoSuchElementException
        System.out.println(a.devolverCadena("Hola amigos").isEmpty());
        System.out.println(a.devolverCadena("Hola amigos").isPresent());
        System.out.println(a.devolverCadena("Hola amigos").orElse("Si che"));
        System.out.println(a.devolverCadena("Hola").orElse("Si che")); //retorna si che porque...
        //... con el parametro suministrado devolveria un Optional vacio
        System.out.println(a.devolverCadena("Hola amigos").orElseThrow());
        //System.out.println(a.devolverCadena("Hola").orElseThrow()); Lanza NoSuchElementException
        //System.out.println("Hello world!");
    }

    
}