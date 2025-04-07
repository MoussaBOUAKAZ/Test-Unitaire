package TP1;

import org.example.TP1.TemperatureConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusVersFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(212, converter.celsiusVersFahrenheit(100), 0.001);
    }

    @Test
    public void testFahrenheitVersCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(100, converter.fahrenheitVersCelsius(212), 0.001);
    }
}
