package orientacaoObjetoCurrencyConverter.entities;

public class CurrencyConverter {

    public static double converter(double rate, double amount) {
        return rate * amount * 1.06;
    }
}
