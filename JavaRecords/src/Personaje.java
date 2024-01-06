import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public record Personaje(String nombre, String origen, int edad) implements ActionListener {

    public int duplicarEdad(){
        return 2*edad;
    }

    public String ponerNombreEnMayuscula(){
        return nombre.toUpperCase();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //Segun esta prueba los java records pueden implementar interfaces pero no pueden heredar
    //de otras clases ni de otros records
}
