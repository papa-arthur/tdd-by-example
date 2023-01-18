package com.alpha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
    }

    @Test
    void testEqualsDollar(){
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8 ));
    }


    @Test
    void testMultiplicationFranc(){
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(new Franc(11), product);
    }

    @Test
    void testEqualsFranc(){
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8 ));
    }
}
