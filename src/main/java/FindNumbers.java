public class FindNumbers {
    public static int findEvenNumberOfDigits(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int evenNumberCount = 0;
        for (int num : nums) {
            int numberLength = String.valueOf(num).replaceFirst("-","").length();
            if (numberLength % 2 == 0) {
                evenNumberCount++;
            }
        }
        return evenNumberCount;
    }
}
