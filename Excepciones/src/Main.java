public class Main {
    public static void main(String[] args) throws MiExcepcion {
        int x = 8;
        int y = 10;

        if(x+y>20){
            System.out.println("Bien");
        }else{
            throw new MiExcepcion("Los numeros deben ser mayores");
        }
        // System.out.println("Hello world!");
    }
}