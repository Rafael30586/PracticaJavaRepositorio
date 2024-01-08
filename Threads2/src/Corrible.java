public class Corrible implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<11;i++){
            System.out.println("Corrible: "+('a'+i));
        }
    }
}
