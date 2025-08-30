import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter the currency to convert from (USD, EUR, INR,JPY,CAD,CNY,NZD): ");
        String fromCurrency = sc.next().toUpperCase();
        System.out.print("Enter the currency to convert to (USD, EUR, INR,JYP,CAD,CNY,NZD): ");
        String toCurrency = sc.next().toUpperCase();
        double conversionRate;
        switch(fromCurrency){
            case"USD":
            switch(toCurrency){
                case "EUR":
                conversionRate=0.92;
                break;
                case "INR":
                conversionRate=82.75;
                break;
                case "JPY":
                conversionRate=157.10;
                break;
                case "CAD":
                conversionRate=1.37;
                break;
                case "CNY":
                conversionRate=7.28;
                break;
                case "NZD":
                conversionRate=1.63;
                break;
                default:
                System.out.println("invalid target currency.");
                return;
            }
            break;
            default:
            System.out.println("invaild source currency");
            return;
        }
         double convertedAmount = amount * conversionRate;
        System.out.println("Converted amount: " + convertedAmount);
        sc.close();
    }
}
