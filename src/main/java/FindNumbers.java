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
        return new int[] {
                binarySearch(nums, target, true),
                binarySearch(nums, target, false)
        };
    }

    public static int binarySearch(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        if (nums.length == 0)
            return ans;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target)
                start = mid + 1;
            else if (nums[mid] > target)
                end = mid - 1;
            else {
                ans = mid;
                if (findStartIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
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
