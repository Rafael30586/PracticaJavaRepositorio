public class Generica<T> {
    private T virusT;

    public Generica(T virusT){
        this.virusT = virusT;
    }

    public void infectar(){
        System.out.println(virusT);
    }
}
