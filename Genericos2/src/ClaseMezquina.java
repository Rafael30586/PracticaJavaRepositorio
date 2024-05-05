public class ClaseMezquina <T extends ClaseTonta & InterfazTonta>{
    private T robo;

    public ClaseMezquina(T robo) {
        this.robo = robo;
    }

    public void robar(){
        System.out.println(robo);
    }
}
