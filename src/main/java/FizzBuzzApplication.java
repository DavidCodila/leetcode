public class FizzBuzzApplication {

    public static String calculateFizzBuzzOutput(int userInput) {
        String output = "";
        if (userInput % 3 == 0)
            output = "Fizz";
        if (userInput % 5 == 0)
            output += "Buzz";
        return (output.isEmpty()) ? Integer.toString(userInput) : output;
    }
}
