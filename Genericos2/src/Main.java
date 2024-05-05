public class Main {
    public static void main(String[] args) {
        Generica<String> generica = new Generica<>("Estás infectado");
        generica.infectar();

        ClaseBoluda claseBoluda = new ClaseBoluda(4);
        ClaseMezquina<ClaseBoluda> ladrona = new ClaseMezquina<ClaseBoluda>(claseBoluda);
        ladrona.robar();

        //System.out.println("Hello world!");
    }
}