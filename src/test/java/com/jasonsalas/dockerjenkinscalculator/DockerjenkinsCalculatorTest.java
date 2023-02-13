package com.jasonsalas.DockerjenkinsCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DockerjenkinsCalculatorTest {
    private DockerjenkinsCalculator calculator = new DockerjenkinsCalculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2,3));
    }
}