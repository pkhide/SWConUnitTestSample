package camt.testsample.c03.mork;

import camt.testexercise.Manager;
import camt.testexercise.VendingMachine;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Prin Kammasitt on 16/11/2557.
 */
public class VendingMachine_Test {
    @Test
    public void calculateTotalPrice_Test(){
        VendingMachine vm = new VendingMachine();
        Manager manager = mock(Manager.class);
        vm.setManager(manager);

        when(manager.getVat()).thenReturn(7.0);
        assertEquals(1.25,vm.calculateTotalPrice(1.0),0.0001);

        when(manager.getVat()).thenReturn(6.5);
        assertEquals(2.25,vm.calculateTotalPrice(2.0),0.0001);
    } 
}
