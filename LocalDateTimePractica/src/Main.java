import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate dia = LocalDate.of(2001, Month.FEBRUARY,3);
        LocalTime hora = LocalTime.of(5,34);
        LocalDateTime horaDia = LocalDateTime.of(2004,Month.JUNE,5,3,17);
        LocalDateTime miCumple = LocalDateTime.of(1986,Month.MAY,30,2,15);

        System.out.println(miCumple.getDayOfWeek());
        System.out.println(miCumple.equals(horaDia));

        System.out.println(dia.atStartOfDay());

        System.out.println(hora.toString());

        //System.out.println("Hello world!");
    }
}