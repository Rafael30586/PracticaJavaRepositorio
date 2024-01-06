public class Main {
    public static void main(String[] args) {
        long a = 12L;
        byte b = 34;
        short c = 120;
        float d = 8.569f;
        double e = 100.3902;
        int f;

        aceptarByte((byte)4);
        aceptarShort((short)5);
        aceptarByte(b);
        aceptarShort(c);

        b = 78;
        // System.out.println("Hello world!");
    }

    public static void aceptarByte(byte b){
        System.out.println("El byte es "+b);
    }

    public static void aceptarShort(short c){
        System.out.println("El short es "+c);
    }
}