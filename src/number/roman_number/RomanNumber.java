package number.roman_number;

class RomanNumber
{
    private StringBuilder result = new StringBuilder();

    String romanNumber(int n)
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException("Number cannot be zero or negative");
        }

        if (n > 3999)
        {
            throw new IllegalArgumentException("Number cannot larger than 3999");
        }

        int number = n;
        int digit = 0;

        RomanCharacter[] characters = getRomanCharacters();

        while (number > 0)
        {
            int oneDigit = number % 10;
            number = number / 10;

            OneDigitRomanNumber oneDigitRomanNumber = new OneDigitRomanNumber(characters[digit]);
            digit ++;

            addLeftMostDigit(oneDigitRomanNumber.romanDigit(oneDigit));
        }

        return result.toString();
    }

    private RomanCharacter[] getRomanCharacters()
    {
        RomanCharacter[] characters = new RomanCharacter[4];
        characters[0] = new RomanCharacterForFirstDigit();
        characters[1] = new RomanCharacterForSecondDigit();
        characters[2] = new RomanCharacterForThirdDigit();
        characters[3] = new RomanCharacterForFourthDigit();
        return characters;
    }

    private RomanNumber addLeftMostDigit(String anotherRomanNumber)
    {
        result.insert(0, anotherRomanNumber);
        return this;
    }
}