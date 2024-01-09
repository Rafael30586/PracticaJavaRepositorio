@FunctionalInterface //Indica que es una interfaz funcional (debe tener un solo metodo abstracto)
public interface InterfazDePrueba {
    public int g = 9; //public,static y final son redundantes en interfaces
    static boolean j = false; //los atributos de interfaces deben estar inicializados si o si
    final double cosa = 8.9;
    int google = 56; //no se permite usar private ni protected

    void saludar(String saludo);

    default String saludar(String saludo,String nombre){ //con el modificador default lo metodos...
        return saludo+" "+nombre;//...pueden tener cuerpo
    }

    //int sumar();
}
