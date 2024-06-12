public class Main {
    public static void main(String[] args) {
        int x=3;

        for(;;){
            System.out.println("x = "+x);
            if(x==7){
                break;
            }
            x++;
        }

        for(long i=0,j=4;i<5||j<=10;i++,j+=2){
            System.out.println("i = "+i+" j = "+j);
        }

        for(char c='e';c<'l';c++){
            System.out.println("c = "+c);
        }

        mario:for(int i=0,j=5;i<7&&j<=15;i++,j++){
            if(i==1){
                continue;
            }else if(j==10){
                break mario;
            }
            System.out.println("i = "+i+" j = "+j);
        }

        //System.out.println("Hello world!");
    }
}