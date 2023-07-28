import javax.swing.*;

public class TemperatureConverterGUI {
    private TemperatureConverter temperatureConverter = new TemperatureConverter();

    public void showTemperatureConverterPanel() {
        String[] options = {"Celsius to Fahrenheit", "Fahrenheit to Celsius", "Celsius to Kelvin", "Kelvin to Celsius", "Fahrenheit to Kelvin", "Kelvin to Fahrenheit"};
        int choice = JOptionPane.showOptionDialog(null, "Select the conversion:", "Temperature Converter", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        String inputStr = JOptionPane.showInputDialog(null, "Enter the temperature to convert:", "Temperature Converter", JOptionPane.PLAIN_MESSAGE);
        if (inputStr == null) {
            return;
        }

        try {
            double inputTemp = Double.parseDouble(inputStr);
            double result;
            String fromUnit, toUnit;

            switch (choice) {
                case 0:
                    result = temperatureConverter.convertCelsiusToFahrenheit(inputTemp);
                    fromUnit = "Celsius";
                    toUnit = "Fahrenheit";
                    break;
                case 1:
                    result = temperatureConverter.convertFahrenheitToCelsius(inputTemp);
                    fromUnit = "Fahrenheit";
                    toUnit = "Celsius";
                    break;
                case 2:
                    result = temperatureConverter.convertCelsiusToKelvin(inputTemp);
                    fromUnit = "Celsius";
                    toUnit = "Kelvin";
                    break;
                case 3:
                    result = temperatureConverter.convertKelvinToCelsius(inputTemp);
                    fromUnit = "Kelvin";
                    toUnit = "Celsius";
                    break;
                case 4:
                    result = temperatureConverter.convertFahrenheitToKelvin(inputTemp);
                    fromUnit = "Fahrenheit";
                    toUnit = "Kelvin";
                    break;
                case 5:
                    result = temperatureConverter.convertKelvinToFahrenheit(inputTemp);
                    fromUnit = "Kelvin";
                    toUnit = "Fahrenheit";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid choice");
            }

            JOptionPane.showMessageDialog(null, inputTemp + " " + fromUnit + " is equal to " + result + " " + toUnit, "Temperature Converter", JOptionPane.INFORMATION_MESSAGE);
            askForAnotherConversion();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid temperature.", "Temperature Converter", JOptionPane.ERROR_MESSAGE);
            showTemperatureConverterPanel();
        }
    }

    private void askForAnotherConversion() {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to convert something else?", "Temperature Converter", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            showTemperatureConverterPanel();
        } else {
            System.exit(0);
        }
    }
}
