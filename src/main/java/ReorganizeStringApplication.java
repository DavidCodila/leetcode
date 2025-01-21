import java.security.InvalidParameterException;

public final class ReorganizeStringApplication {

    public static String reorganizeString(String input) {
        validateInput(input);
        CustomCharacterArrayClass customCharacterArrayClass = new CustomCharacterArrayClass(input);
        return customCharacterArrayClass.reorganizeWihNoRepeatingCharacters();
    }

    private static void validateInput(String input) {
        if (input.isEmpty())
            throw new InvalidParameterException("Input can not be empty");
        if (input.length() > 500)
            throw new InvalidParameterException("Input can not exceed 500 characters");
        if (!input.equals(input.toLowerCase()))
            throw new InvalidParameterException("Input must consist of only lowercase letters");
    }
}
