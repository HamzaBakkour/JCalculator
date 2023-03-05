package com.hamza.temp;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TempApplicationTest {
    private TempController calculator = new TempController();
    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }
}