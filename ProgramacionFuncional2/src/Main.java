public class Main {
    public static void main(String[] args) {
        MiInterfaz miInterfaz = () -> System.out.println("Hola che");
        miInterfaz.saludar();

        MiOtraInterfaz miOtraInterfaz = () -> "Aaaaaaaaaaaaaaaahhhhhhhh";
        System.out.println(miOtraInterfaz.gritar());


        LaMejorInterfaz laMejorInterfaz = (a) -> {
            //a=9;
            return a*2;
        };
        System.out.println("Resultado: "+laMejorInterfaz.duplicar(4));
        //System.out.println("Hello world!");
    }
}