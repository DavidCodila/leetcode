public class BinaryNumberApplication {
    public BinaryNumberApplication() {
    }
    public String hasAlternatingBits(int number) {
        String numberAsABinaryString = Integer.toBinaryString(number);
        String hasAlternating = "false";
        if (numberAsABinaryString.contains("10") || numberAsABinaryString.contains("01")) {
            hasAlternating = "true";
        }
        return "Output: " + hasAlternating + "\n" +
                "Explanation: The binary representation of " + number + " is: " + numberAsABinaryString;
    }
}
