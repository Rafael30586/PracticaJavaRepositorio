package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class ClaseATestearTest2 extends TestCase {
    @Test
    public void comprobarSuma(){
        ClaseATestear claseATestear = new ClaseATestear();
        assertEquals(3,claseATestear.sumarTresNumeros(1,1,1));
    }
}