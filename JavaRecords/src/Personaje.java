public record Personaje(String nombre, String origen, int edad) {

    public int duplicarEdad(){
        return 2*edad;
    }

    public String ponerNombreEnMayuscula(){
        return nombre.toUpperCase();
    }
}
