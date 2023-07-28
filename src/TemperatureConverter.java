public class TemperatureConverter {
    public double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double convertKelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double convertFahrenheitToKelvin(double fahrenheit) {
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        return convertCelsiusToKelvin(celsius);
    }

    public double convertKelvinToFahrenheit(double kelvin) {
        double celsius = convertKelvinToCelsius(kelvin);
        return convertCelsiusToFahrenheit(celsius);
    }
}
