package clases;

public class OtraClase extends UnaClase{

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

class OtraClaseColagada{
    public OtraClaseColagada() {
        OtraClaseMas otraClaseMas = new OtraClaseMas(320_034L);
        otraClaseMas.devolverSaludo(); //Este método protected se puede usar porque pertenece a una clase...
                                       //...que está en el mismo paquete.
    }
}
