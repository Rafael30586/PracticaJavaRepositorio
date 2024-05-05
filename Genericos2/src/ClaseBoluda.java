public class ClaseBoluda extends ClaseTonta{
    private int numeroBoludo;

    public ClaseBoluda(int numeroBoludo) {
        this.numeroBoludo = numeroBoludo;
    }

    public void boludear(){
    }

    @Override
    public String toString() {
        return "Este objeto es un boludo";
    }
}
