public class VideoJuego {

    String titulo;
    int precio;

    static class Personaje {
        String nombre;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return this.getNombre();
        }
    }

}
