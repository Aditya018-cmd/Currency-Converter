import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample exchange rates (as of a particular date; these change over time)
        final double USD_TO_INR = 83.15;
        final double EUR_TO_INR = 90.50;
        final double GBP_TO_INR = 105.75;
        final double JPY_TO_INR = 0.57;
        final double AUD_TO_INR = 55.20;

        System.out.println("Currency Converter to Indian Rupees (INR)");
        System.out.println("Available currencies: USD, EUR, GBP, JPY, AUD");
        System.out.print("Enter currency code (e.g., USD): ");
        String currency = scanner.nextLine().toUpperCase();

        System.out.print("Enter amount in " + currency + ": ");
        double amount = scanner.nextDouble();

        double inrAmount;

        switch (currency) {
            case "USD":
                inrAmount = amount * USD_TO_INR;
                break;
            case "EUR":
                inrAmount = amount * EUR_TO_INR;
                break;
            case "GBP":
                inrAmount = amount * GBP_TO_INR;
                break;
            case "JPY":
                inrAmount = amount * JPY_TO_INR;
                break;
            case "AUD":
                inrAmount = amount * AUD_TO_INR;
                break;
            default:
                System.out.println("Unsupported currency.");
                scanner.close();
                return;
        }

        System.out.printf("%.2f %s = %.2f INR%n", amount, currency, inrAmount);
        scanner.close();
    }
}