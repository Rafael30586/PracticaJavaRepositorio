import junit.framework.TestCase;


public class ClaseATestearTest extends TestCase {

    public void testSumarTresNumeros() {
        ClaseATestear claseATestear = new ClaseATestear();
        assertEquals(3,claseATestear.sumarTresNumeros(1,1,1));
    }

    public void testeSumarTresNumeros2(){
        ClaseATestear claseATestear = new ClaseATestear();
        assertEquals(17,claseATestear.sumarTresNumeros(3,4,10));
    }

}