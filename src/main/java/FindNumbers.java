public class FindNumbers {
    public static int findEvenNumberOfDigits(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int evenNumberCount = 0;
        for (int num : nums) {
            if (isEvenNumberOfDigits(num)) {
                evenNumberCount++;
            }
        }
        return evenNumberCount;
    }

    private static boolean isEvenNumberOfDigits(int num) {
        return getNumberOfDigits(num) % 2 == 0;
    }

    private static int getNumberOfDigits(int num) {
        if (num < 0)
            num = num * - 1;
        return (int) Math.log10(num) + 1;
    }
}
