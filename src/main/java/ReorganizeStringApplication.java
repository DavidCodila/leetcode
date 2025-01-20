public final class ReorganizeStringApplication {

    public static String reorganizeString(String input) {
        if (input.length() == 1)
            return input;
        if (input.length() == 2 && (input.charAt(0) == input.charAt(1)))
            return "";
        char[] characterArray = input.toCharArray();
        for (int i = 0; i < characterArray.length - 1; i++) {
            if (characterArray[i] == characterArray[i + 1]) {
                return String.valueOf(shiftCharactersDown(characterArray));
            }
        }
        return input;
    }

    private static char[] shiftCharactersDown(char[] characterArray) {
        int lastIndex = characterArray.length - 1;
        char characterToShift = characterArray[0];
        for (int i = 0; i < lastIndex; i++) {
            characterArray[i] = characterArray[i + 1];
        }
        characterArray[lastIndex] = characterToShift;
        return characterArray;
    }

}