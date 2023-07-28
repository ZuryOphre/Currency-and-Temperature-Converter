public class CurrencyConverter {
    public double convert(String fromCurrency, String toCurrency, double amount) {
        double fromRate = getExchangeRate(fromCurrency);
        double toRate = getExchangeRate(toCurrency);
        return amount * (toRate / fromRate);
    }

    private double getExchangeRate(String currency) {
        switch (currency) {
            case "USD":
                return ExchangeRates.getUsdToClpRate();
            case "EUR":
                return ExchangeRates.getEurToClpRate();
            case "GBP":
                return ExchangeRates.getGbpToClpRate();
            case "JPY":
                return ExchangeRates.getJpyToClpRate();
            case "KRW":
                return ExchangeRates.getKrwToClpRate();
            case "CLP":
                return 1.0;
            default:
                throw new IllegalArgumentException("Invalid currency code: " + currency);
        }
    }
}
