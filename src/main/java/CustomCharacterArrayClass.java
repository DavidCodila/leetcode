public class CustomCharacterArrayClass {

    private char[] array;
    private int repeatedCharacterIndex;
    private char characterToMove;
    private boolean arrayContainsRepeatingCharacters;

    public CustomCharacterArrayClass(String userInput) {
        this.array = userInput.toCharArray();
        setFieldVariables();
    }

    private void setFieldVariables()
    {
        this.repeatedCharacterIndex = getRepeatedCharIndex();
        this.arrayContainsRepeatingCharacters = this.repeatedCharacterIndex != -1;
        if (this.arrayContainsRepeatingCharacters)
            this.characterToMove = this.array[this.repeatedCharacterIndex];
    }

    private int getRepeatedCharIndex() {
        for (int i = 0; i < this.array.length - 1; i++) {
            if (this.array[i] == this.array[i + 1])
                return i;
        }
        return -1;
    }

    public String reorganizeWihNoRepeatingCharacters() {
        while (this.arrayContainsRepeatingCharacters) {
            reorganizeArray();
            setFieldVariables();
        }
        return String.valueOf(this.array);
    }

    private void reorganizeArray() {
        for (int i = 0; i < this.array.length - 1; i++) {
            if (indexToShiftCharacterExists(i)) {
                switch (getCharacterShiftDirection(i)) {
                    case "left":
                        shiftCharacterToTheLeft(i);
                        return;
                    case "right":
                        shiftCharacterToTheRight(i);
                        return;
                }
            }
        }
        this.array = new char[]{}; //returns empty char array if the array can not be rearranged
    }

    private boolean indexToShiftCharacterExists(int indexToShiftCharacterTo) {
        return this.characterToMove != this.array[indexToShiftCharacterTo]
                && this.characterToMove != this.array[indexToShiftCharacterTo + 1];
    }

    private String getCharacterShiftDirection(int indexToShiftCharacterTo) {
        if (indexToShiftCharacterTo < this.repeatedCharacterIndex)
            return "left";
        return "right";
    }

    private void shiftCharacterToTheLeft(int indexToShiftCharacterTo) {
        for (int j = this.repeatedCharacterIndex; j > indexToShiftCharacterTo - 1; j--) {
            this.array[j + 1] = this.array[j];
        }
        this.array[indexToShiftCharacterTo + 1] = this.characterToMove;
    }

    private void shiftCharacterToTheRight(int indexToShiftCharacterTo) {
        for (int j = this.repeatedCharacterIndex; j < indexToShiftCharacterTo; j++) {
            this.array[j] = this.array[j + 1];
        }
        this.array[indexToShiftCharacterTo] = this.characterToMove;
    }
}
