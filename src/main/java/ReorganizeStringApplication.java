public final class ReorganizeStringApplication {

    public static String reorganizeString(String input) {
        if (input.length() == 1)
            return input;
        if (input.length() == 2) {
            if (input.charAt(0) == input.charAt(1))
                return "";
            else
                return input;
        }
        CustomCharacterArrayClass customCharacterArrayClass = new CustomCharacterArrayClass(input);
        return customCharacterArrayClass.reorganizeWihNoRepeatingCharacters();
    }
}
