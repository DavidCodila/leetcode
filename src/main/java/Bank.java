public class Bank {
    public static int getRichestCustomerWealth(int[][] arrayOfBankAccounts) {
        if (arrayOfBankAccounts.length == 0)
            return 0;
        int maxWealth = 0;
        for (int[] BankAccounts : arrayOfBankAccounts) {
            int customerWealth = getTotalWealth(BankAccounts);
            if (customerWealth > maxWealth)
                maxWealth = customerWealth;
        }
        return maxWealth;
    }

    private static int getTotalWealth(int[] bankAccounts) {
        int wealth = 0;
        for (int bankAccount : bankAccounts) {
            wealth += bankAccount;
        }
        return wealth;
    }
}
