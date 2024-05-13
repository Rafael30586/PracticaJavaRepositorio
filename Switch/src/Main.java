public class Main {
    public static void main(String[] args) {

        int a1 =7;
        byte a2 = 1;
        short a3 = 23;
        String a4 = "Hola";
        char a5 = '#';
        byte a6 = 'y';
        int a7 = '+';
        byte a8 = (byte)1000; //Si no hago el casting da error
        short a9 = (short)20000000; //Si no hago el casting da error
        byte a10 = 127; // Parece que es el máximo valor que puede tomar sin casting
        short a11 = 30000;

        System.out.println("a1: "+a1);
        System.out.println("a2: "+a2);
        System.out.println("a3: "+a3);
        System.out.println("a4: "+a4);
        System.out.println("a5: "+a5);
        System.out.println("a6: "+a6);
        System.out.println("a7: "+a7);
        System.out.println("a8: "+a8);
        System.out.println("a9: "+a9);
        System.out.println("a10: "+a10);
        System.out.println("a11: "+a11);

        //System.out.println("Hello world!");
    }
}