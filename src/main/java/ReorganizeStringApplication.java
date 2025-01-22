import java.security.InvalidParameterException;

public final class ReorganizeStringApplication {

    public static String reorganizeString(String input) {
        validateInput(input);
        char[] characterArray = input.toCharArray();
        while (getRepeatedCharIndex(characterArray) != -1) {
            characterArray = getReorganizedArray(characterArray);
        }
        return String.valueOf(characterArray);
    }


    private static int getRepeatedCharIndex(char[] characterArray) {
        for (int i = 0; i < characterArray.length - 1; i++) {
            if (characterArray[i] == characterArray[i + 1])
                return i;
        }
        return -1;
    }

    private static char[] getReorganizedArray(char[] characterArray) {
        for (int i = 0; i < characterArray.length - 1; i++) {
            if (indexToShiftCharacterExists(i, characterArray)) {
                switch (getCharacterShiftDirection(i, characterArray)) {
                    case "left":
                        return shiftCharacterToTheLeft(i, characterArray);
                    case "right":
                        return shiftCharacterToTheRight(i, characterArray);
                }
            }
        }
        return new char[]{}; //returns empty char array if the array can not be rearranged
    }

    private static boolean indexToShiftCharacterExists(int indexToShiftCharacterTo, char[] characterArray) {
        char characterToMove = characterArray[getRepeatedCharIndex(characterArray)];
        return characterToMove != characterArray[indexToShiftCharacterTo]
                && characterToMove != characterArray[indexToShiftCharacterTo + 1];
    }

    private static String getCharacterShiftDirection(int indexToShiftCharacterTo, char[] characterArray) {
        if (indexToShiftCharacterTo < getRepeatedCharIndex(characterArray))
            return "left";
        return "right";
    }

    private static char[] shiftCharacterToTheLeft(int indexToShiftCharacterTo, char[] characterArray) {
        int repeatedCharacterIndex = getRepeatedCharIndex(characterArray);
        char characterToMove = characterArray[repeatedCharacterIndex];
        for (int j = repeatedCharacterIndex; j > indexToShiftCharacterTo - 1; j--) {
            characterArray[j + 1] = characterArray[j];
        }
        characterArray[indexToShiftCharacterTo + 1] = characterToMove;
        return characterArray;
    }

    private static char[] shiftCharacterToTheRight(int indexToShiftCharacterTo, char[] characterArray) {
        int repeatedCharacterIndex = getRepeatedCharIndex(characterArray);
        char characterToMove = characterArray[repeatedCharacterIndex];
        for (int j = repeatedCharacterIndex; j < indexToShiftCharacterTo; j++) {
            characterArray[j] = characterArray[j + 1];
        }
        characterArray[indexToShiftCharacterTo] = characterToMove;
        return characterArray;
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
