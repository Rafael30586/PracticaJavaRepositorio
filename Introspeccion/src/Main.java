import javax.swing.*;
import java.lang.reflect.*;

public class Main {



    public static void main(String[] args) {

        Method[] metodos;
        Field[] campos;
        Class superclase;
        Constructor[] constructores;
        Type[] parametros;
        Modifier[] modificadores;
        UnaClase unaClase = new UnaClase();
        Field[] campos2;

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

        System.out.println(campos[4].getModifiers());

        System.out.println("Privado: "+Modifier.PRIVATE);
        System.out.println("Publico: "+Modifier.PUBLIC);
        System.out.println("Interfaz: "+Modifier.INTERFACE);

        System.out.println();
        System.out.println("---------------------------------------------------");

        campos2 = unaClase.getClass().getFields();
        int a = campos2[0].getModifiers();
        int b = Modifier.FINAL - Modifier.PRIVATE;

        System.out.println("a= "+a);
        System.out.println("b= "+b);

        if(a==b){
            System.out.println("Estás igual!");
        }else{
            System.out.println("Estás distinto, viejo...");
        }

        System.out.println(boton.getClass().getDeclaredMethods().length+" Metodos en total");
        System.out.println("La superclase es: "+boton.getClass().getSuperclass().getName());

        //System.out.println("Hello world!");
    }
}