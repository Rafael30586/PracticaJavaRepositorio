import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        double numeraso;

        AtomicInteger numero = new AtomicInteger(5);
        System.out.println("numero: "+numero);
        numero.addAndGet(46);
        System.out.println("numero: "+numero);
        numeraso = numero.doubleValue();
        System.out.println("numeraso: "+numeraso);
        System.out.println("numero mas metodo: "+numero.decrementAndGet()); //parece que este metodo...
        //... sirve para reemplazar al x-- u operador de decremento
        numero.compareAndExchange(50,78); //Este metodo funciona como condicional...
        System.out.println("numero: "+numero);//... si en expected value escribo el valor que la variable...
        //...posee, entonces su valor cambiara al valor pasado como parametro llamado newValue
        numero.compareAndExchangeAcquire(78,17);//No conozco la diferencia entre...
        System.out.println("numero: "+numero);//... campareAndExchange() y este
        numero.compareAndExchangeRelease(17,60);//idem al anterior
        System.out.println("numero: "+numero);
        System.out.println("boolean: "+numero.compareAndSet(61,89));//Parecido a los...
        System.out.println("numero: "+numero);//... anteriores pero devuelve boolean


        try {
            System.out.println("Hola");
            Thread.sleep(1000);
            System.out.println("Mundo");
        }catch (Exception e){

        }


        //System.out.println("Hello world!");
    }
}