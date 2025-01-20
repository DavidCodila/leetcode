public final class ReorganizeStringApplication {

    public static String reorganizeString(String input) {
        if (input.length() == 1) {
            return input;
        }
        char[] characterArray = input.toCharArray();
        if (characterArray[0] == characterArray[1]) {
            if (input.length() == 2)
                return "";
            return String.valueOf(shiftCharactersDown(characterArray));
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