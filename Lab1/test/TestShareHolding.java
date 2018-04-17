/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kayant
 */
public class TestShareHolding {
    private ShareHolding hmv;
    
    public TestShareHolding() {
    }
    
    @Before
    public void setUp() {
        hmv = new ShareHolding("HMV",new Sterling(50),500);
    }
    
    @Test
    public void TestShareHoldingCreation() {
        assertEquals("HMV", hmv.getName());
        assertEquals(50,hmv.getPrice().getValue());
        assertEquals(500, hmv.getQuantity());
        hmv.setPrice(new Sterling(60));
        assertEquals(60, hmv.getPrice().getValue());
        hmv.setQuantity(10);
        assertEquals(10, hmv.getQuantity());
    }
}
