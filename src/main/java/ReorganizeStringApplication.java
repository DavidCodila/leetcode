public final class ReorganizeStringApplication {
    public static final int NO_REPEATED_CHARACTERS = -1;

    public static String reorganizeString(String input) {
        if (input.length() == 1)
            return input;
        if (input.length() == 2) {
            if (input.charAt(0) == input.charAt(1))
                return "";
            else
                return input;
        }
        char[] characterArray = input.toCharArray();
        int repeatedCharIndex = getRepeatedCharIndex(characterArray);
        while (repeatedCharIndex != NO_REPEATED_CHARACTERS) {
            characterArray = reorganizeArrayAtIndex(characterArray, repeatedCharIndex);
            repeatedCharIndex = getRepeatedCharIndex(characterArray);
        }
        return String.valueOf(characterArray);
    }

    private static int getRepeatedCharIndex(char[] characterArray) {
        for (int i = 0; i < characterArray.length - 1; i++) {
            if (characterArray[i] == characterArray[i + 1])
                return i;
        }
        return NO_REPEATED_CHARACTERS;
    }

    private static char[] reorganizeArrayAtIndex(char[] characterArray, int repeatedCharacterIndex) {
        char[] emptyCharArray = new char[]{};
        char characterToMove = characterArray[repeatedCharacterIndex];
        String characterShiftDirection = getCharacterShiftDirection(characterArray, repeatedCharacterIndex);
        if (characterShiftDirection.equals("left")) {
            for (int i = 0; i < repeatedCharacterIndex - 1; i++) {
                if (characterToMove != characterArray[i]
                        && characterToMove != characterArray[i + 1]) {
                    for (int j = repeatedCharacterIndex; j > i - 1; j--) {
                        characterArray[j + 1] = characterArray[j];
                    }
                    characterArray[i + 1] = characterToMove;
                    return characterArray;
                }
            }
        }
        else if (characterShiftDirection.equals("right")) {
            for (int i = repeatedCharacterIndex; i < characterArray.length - 1; i++) {
                if (characterToMove != characterArray[i]
                        && characterToMove != characterArray[i + 1]) {
                    for (int j = repeatedCharacterIndex; j < i; j++) {
                        characterArray[j] = characterArray[j + 1];
                    }
                    characterArray[i] = characterToMove;
                    return characterArray;
                }
            }
        }
        return emptyCharArray;
    }

    private static String getCharacterShiftDirection(char[] characterArray, int repeatedCharacterIndex) {
        if (repeatedCharacterIndex == 0 || repeatedCharacterIndex == 1) {
            return "right";
        }
        else if (repeatedCharacterIndex == characterArray.length - 1 || repeatedCharacterIndex == characterArray.length - 2) {
            return "left";
        }
        else {
            for (int i = 0; i < repeatedCharacterIndex - 1; i++) {
                if (characterArray[repeatedCharacterIndex] != characterArray[i]
                        && characterArray[repeatedCharacterIndex] != characterArray[i + 1]) {
                    return "left";
                }
            }
            return "right";
        }
    }

}
















