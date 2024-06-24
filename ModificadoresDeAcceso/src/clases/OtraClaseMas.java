package clases;

public class OtraClaseMas extends OtraClase{

    public OtraClaseMas(long unAtributo) {
        super(unAtributo);
    }

    @Override
    public boolean decirSi(){
        return true;
    }

    protected String devolverSaludo(){
        return "Hola";
    }

    int sumarAlgo(){
        return 6+3;
    }
}

class ClaseColgada{

    public ClaseColgada() {
        OtraClaseMas otraClaseMas = new OtraClaseMas(300L);

        otraClaseMas.devolverSaludo(); //Se puede usar este método porque es protected, si fuera private...
                                       //...no se podría
    }

}
