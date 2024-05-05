import java.time.LocalDate;

public class Persona implements UnaInterfaz{

    private long dni;
    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    @Override
    public void mostrarNombreYApellido() {
        System.out.println("Hola");
    }
}
