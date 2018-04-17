/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.annotation.Target;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kayant
 */
public class TestSterling {

    public TestSterling() {
    }

    @Test
    public void Testvalue() {
        Sterling test = new Sterling(10);
        assertEquals(10, test.getValue());
    }
    
    @Test
    public void TestAddToValue() {
        Sterling test = new Sterling(10);
        Sterling v2 = new Sterling(5);
        test.addToValue(v2);
        assertEquals(15, test.getValue());
    }

    @Test
    public void TestchangeByPercentage() {
        Sterling test = new Sterling(10);
        test.changeByPercentage(15.0);
        assertEquals(10 * 15 / 100, test.getValue());
    }
}
