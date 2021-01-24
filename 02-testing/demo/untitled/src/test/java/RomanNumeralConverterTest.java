import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralConverterTest {

    @Test
    void oneShouldConvertToI() {
        RomanNumeralConverter converter = new RomanNumeralConverter(); //Arrange

        String result = converter.convert(1); //Act

        assertEquals("I", result);// assert
    }
}
