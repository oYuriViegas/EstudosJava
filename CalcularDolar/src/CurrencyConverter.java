public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double converterReais(double dollar, double amount){
        return (dollar * amount) + (dollar * amount) * IOF;
    }
}
