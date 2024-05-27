public class Conexion {

    private static Conexion instancia;

    private Conexion(){
        System.out.println("Instancia de conexión creada");
    }

    public static Conexion obtenerInstancia(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }

    @Override
    public String toString() {
        return "Esta es una conexión";
    }
}
