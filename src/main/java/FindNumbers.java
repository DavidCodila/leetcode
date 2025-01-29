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


    public static int[] searchRange(int[] nums, int target) {
        int indexOfTargetOccurrence = Binary.binarySearch(nums, target);
        if (indexOfTargetOccurrence == -1)
            return new int[]{-1, -1};
        int max = indexOfTargetOccurrence;
        int min = indexOfTargetOccurrence;
        while (max < nums.length - 1) {
            if (nums[max + 1] == target)
                max++;
            else
                break;
        }
        while (min > 0) {
            if (nums[min - 1] == target)
                min--;
            else
                break;
        }
        return new int[] {min, max};
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
