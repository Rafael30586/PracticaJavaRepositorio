import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Persona per1 = new Persona();

        probarInterfaz(per1);

        probarInterfaz(()-> System.out.println("Chau loco"));

        probarOtraInterfaz(() -> {
                String f = "Jodanse";
                return f;
        });

        probarUnaInterfazMas("rtf",(f) -> System.out.println(f));
        //System.out.println("Hello world!");
    }

    public static void probarInterfaz(UnaInterfaz unaInterfaz){
        unaInterfaz.mostrarNombreYApellido();
    }

    public static void probarOtraInterfaz(OtraInterfaz otraInterfaz){
        otraInterfaz.joder();
    }

    public static void probarUnaInterfazMas(String j,UnaInterfazMas unaInterfazMas){
        unaInterfazMas.mostrarAlgo(j);
    }
}