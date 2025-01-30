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
                Binary.binarySearchForFirstOrLastOccurrenceOfDuplicateNumber(nums, target, true),
                Binary.binarySearchForFirstOrLastOccurrenceOfDuplicateNumber(nums, target, false)
        };
    }

    public static int findPeakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int findInMountainArray(int target, MountainArrayInterface mountainArray) {
        int start = 0;
        int end = mountainArray.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArray.get(mid) > mountainArray.get(mid + 1)) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        int maxMountainArrayValue = start;
        start = 0;
        end = maxMountainArrayValue;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArray.get(mid) < target)
                start = mid + 1;
            else if (mountainArray.get(mid) > target)
                end = mid - 1;
            else {
                ans = mid;
                break;
            }
        }
        if (ans != -1) {
            return ans;
        }
        start = maxMountainArrayValue;
        end = mountainArray.length() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArray.get(mid) > target)
                start = mid + 1;
            else if (mountainArray.get(mid) < target)
                end = mid - 1;
            else {
                ans = mid;
                break;
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
