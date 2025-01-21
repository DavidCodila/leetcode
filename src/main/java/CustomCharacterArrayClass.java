public class CustomCharacterArrayClass {

    private char[] array;

    public CustomCharacterArrayClass(String userInput) {
        this.array = userInput.toCharArray();
    }

    public String reorganizeWihNoRepeatingCharacters() {
        while (getRepeatedCharIndex() != -1) {
            reorganizeArray();
        }
        return String.valueOf(this.array);
    }

    private int getRepeatedCharIndex() {
        for (int i = 0; i < this.array.length - 1; i++) {
            if (this.array[i] == array[i + 1])
                return i;
        }
        return -1;
    }

    private void reorganizeArray() {
        char characterToMove = this.array[getRepeatedCharIndex()];
        String characterShiftDirection = getCharacterShiftDirection();
        if (characterShiftDirection.equals("left")) {
            for (int i = 0; i < getRepeatedCharIndex() - 1; i++) {
                if (characterToMove != this.array[i] && characterToMove != this.array[i + 1]) {
                    for (int j = getRepeatedCharIndex(); j > i - 1; j--) {
                        this.array[j + 1] = this.array[j];
                    }
                    this.array[i + 1] = characterToMove;
                    return;
                }
            }
        }
        else if (characterShiftDirection.equals("right")) {
            for (int i = getRepeatedCharIndex(); i < this.array.length - 1; i++) {
                if (characterToMove != this.array[i] && characterToMove != this.array[i + 1]) {
                    for (int j = getRepeatedCharIndex(); j < i; j++) {
                        this.array[j] = this.array[j + 1];
                    }
                    this.array[i] = characterToMove;
                    return;
                }
            }
        }
        this.array = new char[]{};
    }

    private String getCharacterShiftDirection() {
        char characterToMove = this.array[getRepeatedCharIndex()];
        for (int i = 0; i < getRepeatedCharIndex() - 1; i++) {
            if (characterToMove != this.array[i] && characterToMove != this.array[i + 1]) {
                return "left";
            }
        }
        return "right";
    }
}
