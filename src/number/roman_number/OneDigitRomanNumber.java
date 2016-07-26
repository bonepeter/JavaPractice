package number.roman_number;

class OneDigitRomanNumber
{
    private StringBuilder result = new StringBuilder();

    private RomanCharacter character;

    OneDigitRomanNumber(RomanCharacter character)
    {
        this.character = character;
    }

    String romanDigit(int n)
    {
        if (n == 9)
        {
            addRomanOnes(1);
            addRomanTen();
        }
        else if (n > 5)
        {
            addRomanFive();
            addRomanOnes(n - 5);
        }
        else if (n == 5)
        {
            addRomanFive();
        }
        else if (n == 4)
        {
            addRomanOnes(1);
            addRomanFive();
        }
        else
        {
            addRomanOnes(n);
        }

        return result.toString();
    }

    private void addRomanOnes(int n)
    {
        for (int i = 0; i < n; i++)
        {
            result.append(character.one());
        }
    }

    private void addRomanFive()
    {
        addString(character.five());
    }

    private void addString(String s)
    {
        result.append(s);
    }

    private void addRomanTen()
    {
        addString(character.ten());
    }
}
