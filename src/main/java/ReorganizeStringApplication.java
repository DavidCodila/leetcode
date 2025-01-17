import java.util.*;
import java.util.stream.Collectors;

public class ReorganizeStringApplication {
    public ReorganizeStringApplication() {
    }

    public String reorganizeString(String userInput) {
        Map<Character, Integer> characterCountMap = getOrderedCharacterCountMap(userInput);
        int userInputLength = userInput.length();
        if (canNotReorganizeString(characterCountMap, userInputLength))
            return "\"\"";
        return createNonRepeatingCharacterString(characterCountMap, userInputLength);
    }

    private static Map<Character, Integer> getOrderedCharacterCountMap(String userInput) {
        HashMap<Character, Integer> characterCountMap = new HashMap<>();
        for (Character character : userInput.toCharArray()) {
            characterCountMap.put(
                    character,
                    getIncrementedCountOfCharacter(character, characterCountMap)
            );
        }
        //sortToDescendingOrder() is needed for createNonRepeatingCharacterString algorithm, as most frequent
        // characters are used to fill the string first
        return sortToDescendingOrder(characterCountMap);
    }

    private static Integer getIncrementedCountOfCharacter(Character character, Map<Character, Integer> characterCountMap) {
        Integer defaultCount = 0;
        Integer increment = 1;
        return characterCountMap.getOrDefault(character, defaultCount) + increment;
    }

    private static Map<Character, Integer> sortToDescendingOrder(HashMap<Character, Integer> characterCountMap) {
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(characterCountMap.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        return characterCountMap.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));
    }

    //using assumption for frequency (f) and for list of size (s) if:
    // "f > (s + 1)/2" then no possible combinations can be formed with
    // non-repeating characters
    private boolean canNotReorganizeString(Map<Character, Integer> characterCountMap, Integer length) {
        Integer maxNumberOfCharacterCount = Collections.max(characterCountMap.values());
        return maxNumberOfCharacterCount > (length + 1) / 2;
    }

    private String createNonRepeatingCharacterString(Map<Character, Integer> characterCountMap, int length) {
        List<Character> nonRepeatingCharacterArray = createNullInitialisedCharacterArray(length);
        int currentIndex = 0;

        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            Character character = entry.getKey();
            int characterCount = entry.getValue();
            for (int i = 0; i < characterCount; i++) {
                if (allEvenIndexesAreFilled(currentIndex, nonRepeatingCharacterArray)) {
                    currentIndex = 1;
                }
                nonRepeatingCharacterArray.set(currentIndex, character);
                currentIndex += 2;
            }
        }
        return "\"" + nonRepeatingCharacterArray.stream()
                .map(Object::toString)
                .collect(Collectors.joining()) + "\"";
    }

    private static boolean allEvenIndexesAreFilled(int currentIndex, List<Character> nonRepeatingCharacterArray) {
        return currentIndex >= nonRepeatingCharacterArray.size();
    }

    private List<Character> createNullInitialisedCharacterArray(int size) {
        List<Character> resultList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            resultList.add(null);
        }
        return resultList;
    }
}
