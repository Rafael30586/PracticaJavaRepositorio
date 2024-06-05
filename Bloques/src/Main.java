public class Main {

    int numero = 23;
    int binario = 0b101; //0b pasa al número a binario
    //byte Byte = 4000; da error porque 4000 supera el límite permitido para variables de este tipo
    int hexadecimal = 0xe; //0x transforma a los números en hexadecimales

    static {
        System.out.println("Hola desde un bloque estático");
        //Lo que haya dentro de este bloque se ejecuta independientemente de que hayan objetos...
        //...de esta clase
    }

    {
        System.out.println("Hola desde un bloque normal");
        numero = 12; //el valor por defecto del atributo numero sera este para cada objeto
        //System.out.println("Hola desde un bloque normal"+numeraso); da error
        //lo que haya dentro de este bloque se ejecuta por cada objeto creado de esta clase...
        //...Si no hay ningun objeto creado no se ejecuta.
    }

    long numeraso = 8900;

    {
        System.out.println("El numeraso vale: "+numeraso); //Se ejecuta una vez por cada instancia...
        //...de esta clase
    }

    public static void main(String[] args) {

        Main e = new Main();
        Main j = new Main();
        Main t = new Main();

        System.out.println("El número es igual a: "+e.numero);
        System.out.println("El binario es igual a: "+j.binario);
        System.out.println("El hexadecimal es igual a: "+t.hexadecimal);

        paquete.ClaseAProbar prueba = new paquete.ClaseAProbar();

        System.out.println("El nombre es "+prueba.getPruebita().getNombre());

        //System.out.println("Hello world!");
    }
}

class Clase{ //Cuando compila esta clase se transforma en un archivo .class separado del Main.class

}

enum Enum{ //Este también se transforma en un .class aparte de los otros

}