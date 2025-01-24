import java.util.Scanner;

public class InterestCalculator {

    public static double calculateMonthlyRepayments() {
        final char MONTHS_IN_A_YEAR = 12;
        final float PERCENTAGE_CONVERSION = 1F/100F;
        int principal;
        float annualInterestRate;
        byte periodInYears;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal (1K - 1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter a valid amount between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate (1-30%): ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate >= 1 && annualInterestRate <= 30)
                break;
            System.out.println("Enter a valid amount between 1 and 30");
        }

        while (true) {
            System.out.print("Period (1-30 Years): ");
            periodInYears = scanner.nextByte();
            if (periodInYears >= 1 && periodInYears <= 30)
                break;
            System.out.println("Enter a valid amount between 1 and 30");
        }

        double monthlyInterestRate = (annualInterestRate / MONTHS_IN_A_YEAR) * PERCENTAGE_CONVERSION;
        int numberOfPayments = periodInYears * MONTHS_IN_A_YEAR;
        return principal *
                (monthlyInterestRate*Math.pow(1 + monthlyInterestRate, numberOfPayments)
                        / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
    }
}
