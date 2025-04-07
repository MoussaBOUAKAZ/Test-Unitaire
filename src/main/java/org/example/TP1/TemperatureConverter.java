package org.example.TP1;
public class TemperatureConverter {

    public double celsiusVersFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitVersCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
