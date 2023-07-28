import javax.swing.*;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String[] options = {"Currency Conversion", "Temperature Conversion"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Currency Converter", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            if (choice == 0) {
                CurrencyConverterGUI currencyConverterGUI = new CurrencyConverterGUI();
                currencyConverterGUI.showCurrencyConverterPanel();
            } else if (choice == 1) {
                TemperatureConverterGUI temperatureConverterGUI = new TemperatureConverterGUI();
                temperatureConverterGUI.showTemperatureConverterPanel();
            }
        });
    }
}
