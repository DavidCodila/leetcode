public class BinaryNumberApplication {
    public BinaryNumberApplication() {
    }
    public boolean hasAlternatingBits(int number) {
        //write my own .toBinaryString()
        String numberAsABinaryString = Integer.toBinaryString(number);
        if (number == 1) {
            return true;
        }
        return !(numberAsABinaryString.contains("11") || numberAsABinaryString.contains("00"));
    }
}
