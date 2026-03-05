package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAddition() {
        App calculator = new App();
        int result = calculator.add(5, 3);
        assertEquals(8, result);
    }

}