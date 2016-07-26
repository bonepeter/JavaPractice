package number.roman_number;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RomanNumberTest
{
    @Test
    public void _1() throws Exception
    {
        assertRomanNumber(1, "I");
    }

    private void assertRomanNumber(int number, String roman)
    {
        assertEquals(RomanNumber.toRomanNumber(number), roman);
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
}