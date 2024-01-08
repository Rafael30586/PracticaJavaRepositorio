public class Main {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo();
        OtroHilo hilo3 = new OtroHilo();
        //Runnable corrible = new Corrible();
        //Hilo hilo2 = new Hilo(corrible);
        hilo1.start();
        hilo3.start();




        //System.out.println("Hello world!");
    }
}