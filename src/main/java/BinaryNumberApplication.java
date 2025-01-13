public class BinaryNumberApplication {
    public BinaryNumberApplication() {
    }
    public String hasAlternatingBits(int number) {
        String numberAsABinaryString = Integer.toBinaryString(number);
        String hasAlternating = "true";
        if (numberAsABinaryString.contains("11") || numberAsABinaryString.contains("00")) {
            hasAlternating = "false";
        }
        return "Output: " + hasAlternating + "\n" +
                "Explanation: The binary representation of " + number + " is: " + numberAsABinaryString;
    }
}
