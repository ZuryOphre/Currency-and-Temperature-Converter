public class ExchangeRates {

    private static double usdToEurRate = 1 / 0.85;
    private static double usdToGbpRate = 1 / 0.72;
    private static double usdToJpyRate = 1 / 110.23;
    private static double usdToKrwRate = 1 / 1178.50;
    private static double usdToClpRate = 1 / 827.89;

    private static double eurToUsdRate = 1 / usdToEurRate;
    private static double gbpToUsdRate = 1 / usdToGbpRate;
    private static double jpyToUsdRate = 1 / usdToJpyRate;
    private static double krwToUsdRate = 1 / usdToKrwRate;
    private static double clpToUsdRate = 827.89;

    private static double eurToGbpRate = eurToUsdRate / gbpToUsdRate;
    private static double eurToJpyRate = eurToUsdRate / jpyToUsdRate;
    private static double eurToKrwRate = eurToUsdRate / krwToUsdRate;
    private static double eurToClpRate = eurToUsdRate / clpToUsdRate;

    private static double gbpToJpyRate = gbpToUsdRate / jpyToUsdRate;
    private static double gbpToKrwRate = gbpToUsdRate / krwToUsdRate;
    private static double gbpToClpRate = gbpToUsdRate / clpToUsdRate;

    private static double jpyToKrwRate = jpyToUsdRate / krwToUsdRate;
    private static double jpyToClpRate = jpyToUsdRate / clpToUsdRate;

    private static double krwToClpRate = krwToUsdRate / clpToUsdRate;

    private ExchangeRates() {
    }
    public static double getUsdToEurRate() {
        return usdToEurRate;
    }

    public static double getUsdToGbpRate() {
        return usdToGbpRate;
    }

    public static double getUsdToJpyRate() {
        return usdToJpyRate;
    }

    public static double getUsdToKrwRate() {
        return usdToKrwRate;
    }

    public static double getUsdToClpRate() {
        return usdToClpRate;
    }

    public static double getEurToUsdRate() {
        return eurToUsdRate;
    }

    public static double getEurToGbpRate() {
        return eurToGbpRate;
    }

    public static double getEurToJpyRate() {
        return eurToJpyRate;
    }

    public static double getEurToKrwRate() {
        return eurToKrwRate;
    }

    public static double getEurToClpRate() {
        return eurToClpRate;
    }

    public static double getGbpToUsdRate() {
        return gbpToUsdRate;
    }

    public static double getGbpToJpyRate() {
        return gbpToJpyRate;
    }

    public static double getGbpToKrwRate() {
        return gbpToKrwRate;
    }

    public static double getGbpToClpRate() {
        return gbpToClpRate;
    }

    public static double getJpyToUsdRate() {
        return jpyToUsdRate;
    }

    public static double getJpyToKrwRate() {
        return jpyToKrwRate;
    }

    public static double getJpyToClpRate() {
        return jpyToClpRate;
    }

    public static double getKrwToUsdRate() {
        return krwToUsdRate;
    }

    public static double getKrwToClpRate() {
        return krwToClpRate;
    }

    public static double getClpToUsdRate() {
        return clpToUsdRate;
    }
}
