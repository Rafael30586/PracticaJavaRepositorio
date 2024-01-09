
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //esto se agrega para hacer funcionar a @BeforeAll sin...
class ClaseATestearTest {//... la necesidad de hacer static a ningun metodo
/*
    public void dividirPorCero(){ //investigar como se usa assertThrows
        ClaseATestear claseATestear = new ClaseATestear();
        assertThrows(Exception.class,claseATestear.dividirDosNumeros(4,0));
    }*/

    @Test
    @BeforeAll //se ejecuta antes de cualquier test en esta clase, si falla no se ejecutan los...
    public void dividirDosNumeros(){//...posteriores
        ClaseATestear claseATestear = new ClaseATestear();
        assertEquals(6.0,claseATestear.dividirDosNumeros(12,2));
    }

    @Test
    public void compararNumeros(){
        ClaseATestear claseATestear = new ClaseATestear();
        assertFalse(claseATestear.compararDosNumeros(4,2));
    }

    @Test
    public void comprobarSaludo(){
        ClaseATestear claseATestear = new ClaseATestear();
        assertTrue(true,claseATestear.saludar("Hola che"));
    }

    @Test
    @BeforeEach
    public void dividirDosNumeros2(){
        ClaseATestear claseATestear = new ClaseATestear();
        assertEquals(3.5,claseATestear.dividirDosNumeros(7,2));
    }

    @Test
    @Disabled //para que el metodo no se ejecute cuando doy play a la clase
    public void compararNumeros2(){
        ClaseATestear claseATestear = new ClaseATestear();
        assertFalse(claseATestear.compararDosNumeros(4,4));
    }

}