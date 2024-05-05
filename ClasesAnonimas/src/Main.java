public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto();

        Auto autito = new Auto() { //Este objeto autito no pertenecea a la clase Auto, porque acabo...
            @Override //...de crear una clase anónima acá mismo y sobreescribiendo el método mostrarRuedas
            public void mostrarRuedas(){
                System.out.println("Tengo ruedas más grandes");
            }
        };

        auto.mostrarRuedas();
        autito.mostrarRuedas();

        Fitito autillo = new Auto();
        Fitito fitito = new Fitito() { //Clase anonima que debe implementar los metodos de la interfaz...
            @Override//...correspondiente
            public void decirMiColor(){
                System.out.println("Soy muy chiquito y rojo");
            }
        };

        autillo.decirMiColor();
        fitito.decirMiColor();

        //System.out.println("Hello world!");
    }
}