import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {

        Method[] metodos;
        Field[] campos;
        Class superclase;
        Constructor[] constructores;
        Type[] parametros;

        JButton boton = new JButton();

        //System.out.println(boton.getClass().getCanonicalName());

        metodos = boton.getClass().getDeclaredMethods();
        campos = boton.getClass().getFields();
        constructores = boton.getClass().getConstructors();

        for(int i=0;i<metodos.length;i++){
            if(i==0){
                System.out.print("Metodos: ");
            }
            System.out.print(metodos[i].getName()+" - ");
        }

        System.out.println();
        System.out.println("---------------------------------------------------");

        for(int i=0;i<campos.length;i++){
            if(i==0){
                System.out.print("Campos: ");
            }
            System.out.print(campos[i].getName()+" - ");
        }

        System.out.println();
        System.out.println("---------------------------------------------------");

        System.out.println("Cantidad de constructores: "+constructores.length);

        parametros = constructores[0].getGenericParameterTypes();

        System.out.println("Parametros: "+parametros.length);

        for(int i=0;i<parametros.length;i++){
            if(i==0){
                System.out.print("Parametros: ");
            }
            System.out.print(parametros[i].getTypeName().getClass().getName()+" - ");
        }

        System.out.println();
        System.out.println("---------------------------------------------------");

        System.out.println(boton.getClass().getDeclaredMethods().length+" Metodos en total");
        System.out.println("La superclase es: "+boton.getClass().getSuperclass().getName());

        //System.out.println("Hello world!");
    }
}