package home;

import org.junit.Test;

import static home.ArabicToRomanNumerals.*;
import static org.junit.Assert.assertEquals;

public class Converts {

    @Test
    public void converts() {
        assertEquals("I", convert(1));
        assertEquals("II", convert(2));
        assertEquals("III", convert(3));
        assertEquals("IV", convert(4));
        assertEquals("V", convert(5));
        assertEquals("VI", convert(6));
        assertEquals("VII", convert(7));
        assertEquals("VIII", convert(8));
        assertEquals("IX", convert(9));
        assertEquals("X", convert(10));
        assertEquals("XI", convert(11));
        assertEquals("XII", convert(12));
        assertEquals("XIV", convert(14));
        assertEquals("XV", convert(15));
        assertEquals("XVI", convert(16));
        assertEquals("XIX", convert(19));
        assertEquals("XX", convert(20));
        assertEquals("XXI", convert(21));
        assertEquals("XXIV",convert(24));
        assertEquals("L",convert(50));
        assertEquals("C", convert(100));
    }

}

