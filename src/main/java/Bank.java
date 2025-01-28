public class Bank {
    public static int getRichestCustomerWealth(int[][] accounts) {
        if (accounts.length == 0)
            return 0;
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int customerWealth = getTotalWealth(customer);
            if (customerWealth > maxWealth)
                maxWealth = customerWealth;
        }
        return maxWealth;
    }

    private static int getTotalWealth(int[] customer) {
        int wealth = 0;
        for (int bankAccount : customer) {
            wealth += bankAccount;
        }
        return wealth;
    }
}
