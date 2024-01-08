public class VideoJuego {
    public String titulo;
    public Marca desarrollador;

    public VideoJuego(String titulo, Marca desarrollador) {
        this.titulo = titulo;
        this.desarrollador = desarrollador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Marca getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(Marca desarrollador) {
        this.desarrollador = desarrollador;
    }
}
