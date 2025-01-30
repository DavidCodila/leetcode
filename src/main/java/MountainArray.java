public class MountainArray implements MountainArrayInterface {
    private final int[] arr;
    public MountainArray(int[] nums) {
        this.arr = nums;
    }
    public int get(int index) {
        return this.arr[index];
    }
    public int length() {
        return this.arr.length;
    }
}
