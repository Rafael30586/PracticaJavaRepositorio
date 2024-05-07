import java.io.File;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {

        File foto = new File("C:\\Users\\Usuario\\Pictures\\icons\\power_icon_512.png");
        File directorio = new File("C:\\Users\\Usuario\\Downloads\\carpetilla");
        File[] archivos = File.listRoots();
        try{
            FileInputStream fileInputStream = new FileInputStream(foto);
            System.out.println(fileInputStream.read());
        }catch (Exception e){
            System.out.println("Malió sal");
        }


        System.out.println("Se puede leer: "+foto.canRead());
        System.out.println("Se puede ejecutar: "+foto.canExecute());
        System.out.println("Se puede modificar: "+foto.canWrite());

        //System.out.println("Carpeta creada "+directorio.mkdir()); Funcionó!

        System.out.println("Tamaño: "+archivos.length);

        for(File f : archivos){
            System.out.println("Nombre: "+f.getAbsolutePath());
        }

        //System.out.println("Hello world!");
    }
}