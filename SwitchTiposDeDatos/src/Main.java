public class Main {
    public static void main(String[] args) {
        final int algo = 10;
        int alguno = 20;
        Dia algunDia = Dia.MARTES;
        final Dia otroDia = Dia.MIERCOLES;


        switch(alguno){
            case 1:
            case algo: //Se puede poner constantes en switch
        }

        switch(algunDia){ //Asi se usan los enum en switch
            case LUNES -> {
            }
            case MARTES -> {

            }
            case MIERCOLES -> {

            }

        }

        //Tipos de datos permitidos en switch: int, Integer, byte, Byte, short, Short
        //char, Character, String, Enum values

        // System.out.println("Hello world!");
    }

    enum Dia{
        LUNES, MARTES, MIERCOLES;
    }
}