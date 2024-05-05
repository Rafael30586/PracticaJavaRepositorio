import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Persona per1 = new Persona();
        per1.setNombres("Rafael");
        per1.setApellidos("Alvarez");
        per1.setDni(32361730);
        per1.setFechaNacimiento(LocalDate.of(1986, Month.MAY,30));

        String nombreYApellido = per1.mostrarNombreYApellido();

        //System.out.println("Hello world!");
    }
}