package clases2;

import clases.OtraClaseMas;

public class ClaseLoca {
    public ClaseLoca() {

        OtraClaseMas otraClaseMas = new OtraClaseMas(320_034L);/*
        otraClaseMas.devolverSaludo();*/ //Este metodd no puede usarse en esta clase porque es protected...
                                         //...y es de una clase de otro package.
    }
}

class Cuerda extends OtraClaseMas{
    public Cuerda(long unAtributo) {
        super(unAtributo);
        OtraClaseMas otraClaseMas = new OtraClaseMas(320_034L);
        //otraClaseMas.devolverSaludo(); No se puede porque es protected, aunque si se puede sobreescribir
    }

    @Override
    protected String devolverSaludo(){
        return "Hola";
    }
    //@Override no me deja sobreescribirlo porque en la superclase es [default], deberia ser protected...
    int sumarAlgo(){//...o public
        return 12+45;
    }
}
