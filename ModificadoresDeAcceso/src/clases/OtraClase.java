package clases;

public class OtraClase extends  UnaClase{

    public OtraClase(long unAtributo) {
        super(unAtributo);
    }

    protected boolean decirSi(){
        return true;
    }

    @Override
    public int unMetodo(){ //no puede ser privado porque en la superclase es publico, alreves si se podria
        return 8;
    }

}
