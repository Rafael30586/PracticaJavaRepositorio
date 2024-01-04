public class Planeta {
}

enum Astros{
    SOL,
    LUNA,
    MERCURIO,
    VENUS,
    TIERRA,
    MARTE,
    JUPITER,
    SATURNO,
    URANO,
    NEPTUNO,
    PLUTON;
    int id;

}

enum DiasDeLaSemana {
    LUNES(1,"Lunes"),
    MARTES(2,"Martes"),
    MIERCOLES(3,"Miercoles"),
    JUEVES(4,"Jueves"),
    VIERNES(5,"Viernes"),
    SABADO(6,"Sabado"),
    DOMINGO(7,"Domingo");
    int numeroDia;
    String nombreDia;

    DiasDeLaSemana(int numeroDia, String nombreDia){

        this.numeroDia = numeroDia;
        this.nombreDia = nombreDia;
    }

    public int getNumeroDia() {
        return numeroDia;
    }

    public String getNombreDia() {
        return nombreDia;
    }
}

enum MesesDelAnio {
    ENERO(1),
    FEBRERO(2),
    MARZO(3),
    ABRIL(4),
    MAYO(5),
    JUNIO(6),
    JULIO(7),
    AGOSTO(8),
    SEPTIEMBRE(9),
    NOVIEMBRE(10),
    OCTUBRE(11),
    DICIEMBRE(12);

    int numeroMes;
    String nombreMes;

    MesesDelAnio(int numeroMes){
        this.numeroMes = numeroMes;
    }
}
