public class Main {

    public record Animal(String especie){};
    public static void main(String[] args) {
        Personaje p1 = new Personaje("Mario","Video Juegos", 35);

        Animal a1 = new Animal("Tortuga");

        System.out.print(p1.getClass()+"  ");
        System.out.println(p1.edad());

        System.out.println(a1.especie()); //los getter son reemplazados por metodos que cumplen la...
                                          //...misma funcion pero tienen diferente nomenclatura...
                                          // ejemplos en este programa: .especie(), .edad() , .rico(), etc
        record Alimento(String nombre,boolean rico){}; //No se puede hacer public aca dentro del main
        var al1 = new Alimento("Chocolate",true);

        String ricura;
        if(al1.rico){
            ricura = "riqusimo";
        }else{
            ricura = "feito";
        }

        System.out.println("El "+al1.nombre+" es: "+ricura);

        //System.out.println("Hello world!");
    }
}