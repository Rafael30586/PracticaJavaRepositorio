import junit.framework.TestCase;
import org.junit.Assert;


public class ClaseATestearTest extends TestCase {

    public void testSumarTresNumeros() {
        ClaseATestear claseATestear = new ClaseATestear();
        assertEquals(3,claseATestear.sumarTresNumeros(1,1,1));
    }

    public void testSumarTresNumeros2(){
        ClaseATestear claseATestear = new ClaseATestear();
        assertEquals(17,claseATestear.sumarTresNumeros(3,4,10));
    }

    public void dividirPorCero(){
        ClaseATestear claseATestear = new ClaseATestear();

    }

}