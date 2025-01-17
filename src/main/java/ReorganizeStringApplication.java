import java.util.*;
import java.util.stream.Collectors;

public class ReorganizeStringApplication {

    // Main method to reorganize string
    public String reorganizeString(String input) {
        Map<Character, Integer> charCountMap = buildCharacterCountMap(input);
        if (cannotReorganize(charCountMap, input.length())) {
            return "\"\""; // Return empty string if reorganization is impossible
        }
        return buildReorganizedString(charCountMap, input.length());
    }

    // Builds a map of character frequencies, sorted by frequency in descending order
    private Map<Character, Integer> buildCharacterCountMap(String input) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        return sortByDescendingFrequency(countMap);
    }

    // Sorts the character-count map by frequency in descending order
    private Map<Character, Integer> sortByDescendingFrequency(Map<Character, Integer> countMap) {
        return countMap.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // In case of duplicate keys, just keep the first one
                        LinkedHashMap::new)); // Maintains the insertion order
    }

    // Checks if the string can be reorganized based on the frequency of characters
    private boolean cannotReorganize(Map<Character, Integer> charCountMap, int length) {
        int maxFrequency = Collections.max(charCountMap.values());
        return maxFrequency > (length + 1) / 2;
    }

    // Builds the reorganized string where no two adjacent characters are the same
    private String buildReorganizedString(Map<Character, Integer> charCountMap, int length) {
        List<Character> result = new ArrayList<>(Collections.nCopies(length, null));
        int currentIndex = 0;

        // Fill the result list with characters ensuring no two adjacent characters are the same
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                if (currentIndex >= length) {
                    currentIndex = 1; // Start filling odd indexes after even ones are filled
                }
                result.set(currentIndex, character);
                currentIndex += 2; // Move to the next available index
            }
        }

        // Convert the list back to a string and return it
        return "\"" + result.stream()
                .map(String::valueOf)
                .collect(Collectors.joining()) + "\"";
    }
}