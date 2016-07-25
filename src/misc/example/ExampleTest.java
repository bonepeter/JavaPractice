package misc.example;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExampleTest
{
    @Test
    public void testReturnInputNumber() throws Exception
    {
        // Arrange
        Example example = new Example();

        // Act
        int actual = example.returnInputNumber(1);

        // Assert
        assertEquals(actual, 1);
    }
}