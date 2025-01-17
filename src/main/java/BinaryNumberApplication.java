public class BinaryNumberApplication {

    public BinaryNumberApplication() {
    }

    public boolean hasAlternatingBits(int number) {
        if (number == 1) return true;
        String numberAsABinaryString = toBinaryString(number);
        return !(numberAsABinaryString.contains("11") || numberAsABinaryString.contains("00"));
    }

    private String toBinaryString(int number) {
        int remainder;
        StringBuilder binaryString = new StringBuilder();
        while (number != 0) {
            remainder = number % 2;
            number /= 2;
            preAppend(binaryString, remainder);
        }
        return binaryString.toString();
    }

    //Need to pre-append as binary representation
    // will be constructed from least significant
    // bit to most significant bit
    private void preAppend(StringBuilder binaryString, int remainder) {
        binaryString.insert(0, remainder);
    }

}
