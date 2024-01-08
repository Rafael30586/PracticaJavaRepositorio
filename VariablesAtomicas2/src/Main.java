import javax.swing.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        AtomicLong largoAtomico = new AtomicLong(45912L);
        AtomicBoolean buleanAtomico = new AtomicBoolean(true);
        AtomicReference<String> referenciaAtomica = new AtomicReference<>("Hola");
        AtomicMarkableReference<JButton> referenciaAtomica2 = new AtomicMarkableReference<>(new JButton(),
                true);

        System.out.println("el largo: "+largoAtomico.decrementAndGet());

        buleanAtomico.set(false);




        System.out.println("el bulean: "+buleanAtomico);
        System.out.println("el atomico: "+referenciaAtomica.getAcquire());
        System.out.println("el 2do atomico: "+referenciaAtomica2.isMarked());
        //System.out.println("Hello world!");
    }
}