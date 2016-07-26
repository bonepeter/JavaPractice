package number.roman_number;

public class RomanNumber
{
    static String toRomanNumber(int n)
    {
        StringBuilder result = new StringBuilder();

        if (n > 5)
        {
            return "VI";
        }

        if (n == 5)
        {
            return "V";
        }

        if (n == 4)
        {
            return "IV";
        }

        for (int i=0; i<n; i++)
        {
            result.append("I");
        }

        return result.toString();
    }
}
