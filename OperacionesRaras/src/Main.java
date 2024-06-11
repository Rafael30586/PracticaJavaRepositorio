public class Main {
    public static void main(String[] args) {
        int x = 56, y = 102,z = 43;

        int a = (x + --y) * y-- - (43 * ++x) - --z;
        //Los operadores ++ y -- ya sea a la derecha o a la izquierda, modifican a las variables...
        //...en sus valores de manera permanente aun en el contexto de arriba.

        System.out.println("a: "+a);
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("z: "+z);

        long b = y > z ? 1200 : 340;
        System.out.println("b: "+b);
                         //34 porque x > 12 == true, luego 34 de vuelta porque z < 200 == true
        int c = z < 200 ? x > 12 ? 34 : 12 : 76; //ojo con esto
        System.out.println("c: "+c);
        
        //System.out.println("Hello world!");
    }
}