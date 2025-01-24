import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculator {

    public static double calculateMonthlyRepayments() {
        final char MONTHS_IN_A_YEAR = 12;
        final float PERCENTAGE_CONVERSION = 1F/100F;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Period (Years): ");
        int periodInYears = scanner.nextInt();

        double monthlyInterestRate = (annualInterestRate/MONTHS_IN_A_YEAR) * PERCENTAGE_CONVERSION;
        int numberOfPayments = periodInYears * MONTHS_IN_A_YEAR;
        return principal *
                (monthlyInterestRate*Math.pow(1 + monthlyInterestRate, numberOfPayments)
                        / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
    }
}
