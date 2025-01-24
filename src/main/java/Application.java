import java.text.NumberFormat;

public class Application {
    public static void main(String[] args) {
        double monthlyMortgage = InterestCalculator.calculateMonthlyRepayments();
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(monthlyMortgage));
    }
}
