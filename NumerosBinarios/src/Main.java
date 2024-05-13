public class Main {
    public static void main(String[] args) {

        int ultimo = 11;

        for(int i=0;i<=ultimo;i++){
            System.out.println(i+": "+Integer.toBinaryString(i));
        }

        int a=5,b=2,c=11,d=9;

        System.out.println("a|b:"+ (a|b));//Todavía no me queda claro como funcionan estos cuatro operadores
        System.out.println("a&b:"+ (a&b));
        System.out.println("a^b:"+ (a^b));
        System.out.println("~b:"+ (~b));

        //System.out.println("Hello world!");
    }
}