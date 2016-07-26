package number.roman_number;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RomanNumberConverterTest
{
    @Test
    public void _0() throws Exception
    {
        try
        {
            assertRomanNumber(0, "");
        }
        catch (IllegalArgumentException e)
        {
            assertEquals(e.getMessage(), "Number cannot be zero or negative");
        }
    }

    @Test
    public void _4000() throws Exception
    {
        try
        {
            assertRomanNumber(4000, "");
        }
        catch (IllegalArgumentException e)
        {
            assertEquals(e.getMessage(), "Number cannot larger than 3999");
        }
    }

    @Test
    public void _1() throws Exception
    {
        assertRomanNumber(1, "I");
    }

    private void assertRomanNumber(int number, String roman)
    {
        assertEquals(RomanNumberConverter.romanNumber(number), roman);
    }

    @Test
    public void _2() throws Exception
    {
        assertRomanNumber(2, "II");
    }

    @Test
    public void _3() throws Exception
    {
        assertRomanNumber(3, "III");
    }

    @Test
    public void _4() throws Exception
    {
        assertRomanNumber(4, "IV");
    }

    @Test
    public void _5() throws Exception
    {
        assertRomanNumber(5, "V");
    }

    @Test
    public void _6() throws Exception
    {
        assertRomanNumber(6, "VI");
    }

    @Test
    public void _7() throws Exception
    {
        assertRomanNumber(7, "VII");
    }

    @Test
    public void _9() throws Exception
    {
        assertRomanNumber(9, "IX");
    }

    @Test
    public void _10() throws Exception
    {
        assertRomanNumber(10, "X");
    }

    @Test
    public void _11() throws Exception
    {
        assertRomanNumber(11, "XI");
    }

    @Test
    public void _14() throws Exception
    {
        assertRomanNumber(14, "XIV");
    }

    @Test
    public void _25() throws Exception
    {
        assertRomanNumber(25, "XXV");
    }

    @Test
    public void _46() throws Exception
    {
        assertRomanNumber(46, "XLVI");
    }

    @Test
    public void _68() throws Exception
    {
        assertRomanNumber(68, "LXVIII");
    }

    @Test
    public void _99() throws Exception
    {
        assertRomanNumber(99, "XCIX");
    }

    @Test
    public void _100() throws Exception
    {
        assertRomanNumber(100, "C");
    }

    @Test
    public void _999() throws Exception
    {
        assertRomanNumber(999, "CMXCIX");
    }

    @Test
    public void _1000() throws Exception
    {
        assertRomanNumber(1000, "M");
    }

    @Test
    public void _3999() throws Exception
    {
        assertRomanNumber(3999, "MMMCMXCIX");
    }
}