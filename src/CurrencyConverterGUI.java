import javax.swing.*;

public class CurrencyConverterGUI {
    private CurrencyConverter currencyConverter = new CurrencyConverter();

    public void showCurrencyConverterPanel() {
        String[] currencies = {"USD", "EUR", "GBP", "JPY", "KRW", "CLP"};
        String fromCurrency = (String) JOptionPane.showInputDialog(null, "Select the source currency:", "Currency Converter", JOptionPane.PLAIN_MESSAGE, null, currencies, currencies[0]);

        String toCurrency = (String) JOptionPane.showInputDialog(null, "Select the target currency:", "Currency Converter", JOptionPane.PLAIN_MESSAGE, null, currencies, currencies[0]);

        String amountStr = JOptionPane.showInputDialog(null, "Enter the amount to convert:", "Currency Converter", JOptionPane.PLAIN_MESSAGE);
        if (amountStr == null) {
            return; // If the user cancels the input, exit the method
        }

        try {
            double amount = Double.parseDouble(amountStr);
            double result = currencyConverter.convert(fromCurrency, toCurrency, amount);
            JOptionPane.showMessageDialog(null, amount + " " + fromCurrency + " is equal to " + result + " " + toCurrency, "Currency Converter", JOptionPane.INFORMATION_MESSAGE);
            askForAnotherConversion();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Currency Converter", JOptionPane.ERROR_MESSAGE);
            showCurrencyConverterPanel();
        }
    }

    private void askForAnotherConversion() {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to convert something else?", "Currency Converter", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            showCurrencyConverterPanel();
        } else {
            System.exit(0);
        }
    }
}
