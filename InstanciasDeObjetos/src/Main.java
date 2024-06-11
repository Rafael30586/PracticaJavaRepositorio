public class Main {
    public static void main(String[] args) {
        String a = "Hola";
        String b = "Hola";
        String c = new String("Hola");
        String d = "Hol"+"a";
        String e = "Hol"+'a';
        String f = "Ho";
        String g = "la";
        String h = f+g;
        String i = new String("Hola");

        System.out.println("a=b :"+(a==b));//Aca hay que tener cuidado con la concatenacion, si no coloco...
        System.out.println("a=c :"+(a==c));//...parentesis alrededor de a==b da un resultado diferente.
        System.out.println("a=d :"+(a==d));
        System.out.println("a=e :"+(a==e));
        System.out.println("a=h :"+(a==h)); //Da false y no se porque
        System.out.println("h: "+h);
        System.out.println("c=i: "+(c==i));


        /*
         /* */
        //System.out.println("Hello world!");
    }
}