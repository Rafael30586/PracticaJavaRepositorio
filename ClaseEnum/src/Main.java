public class Main {
    public static void main(String[] args) {
        enum Talla{MINI, MEDIANO, GRANDE, MUY_GRANDE}

        Talla s = Talla.MINI;
        Talla m = Talla.MEDIANO;
        Talla l = Talla.GRANDE;
        Talla xl = Talla.MUY_GRANDE;

        System.out.println(s.getClass());
        System.out.println(m.getClass());

        System.out.println(s.hashCode());
        System.out.println(m.hashCode());

        System.out.println(m);
        System.out.println(xl);
        System.out.println(l.name());
        System.out.println(m.ordinal());
        System.out.println(s.toString().contains("MI"));

        System.out.println(DiasDeLaSemana.LUNES);
        DiasDeLaSemana a = DiasDeLaSemana.DOMINGO;
        //System.out.println(new DiasDeLaSemana(3, "Miercoles").toString());

        //System.out.println(MINI.getClass()); Da error

        //Talla w = new Talla(); por ser tipo enum no se puede instanciar

        //System.out.println("Hello world!");
    }
}