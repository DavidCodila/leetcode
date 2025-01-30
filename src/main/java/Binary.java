public class Binary {
    public static int binarySearch(int[] nums, int target) {
        if (nums.length == 0)
            return -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target)
                start = mid + 1;
            else if (nums[mid] > target)
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public static int orderAgnosticBinarySearch(int[] nums, int target, int start, int end){
        if (nums.length == 0) {
            return -1;
        }
        if (nums[0] < nums[nums.length - 1]) {
            return binarySearchWithAscendList(nums, target, start, end);
        }
        else {
            return binarySearchWithDescendList(nums, target, start, end);
        }
    }

    public static int binarySearchWithAscendList(int[] nums, int target, int start, int end) {
        int ans = -1;
        if (nums.length == 0)
            return ans;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target)
                start = mid + 1;
            else if (nums[mid] > target)
                end = mid - 1;
            else {
                ans = mid;
                break;
            }
        }
        return ans;
    }

    public static int binarySearchWithDescendList(int[] nums, int target, int start, int end) {
        int ans = -1;
        if (nums.length == 0)
            return ans;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target)
                start = mid + 1;
            else if (nums[mid] < target)
                end = mid - 1;
            else {
                ans = mid;
                break;
            }
        }
        return ans;
    }

    public static int binarySearchForFirstOrLastOccurrenceOfDuplicateNumber(int[] nums, int target, boolean findStartIndex) {
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
}
