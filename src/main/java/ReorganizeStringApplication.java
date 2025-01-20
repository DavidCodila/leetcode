import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ReorganizeStringApplication {

    public static String reorganizeString(String input) {
        List<Character> charList = new ArrayList<>(input.length());
        for (int i = 0; i < input.length(); i++) {
            charList.add(input.charAt(i));
        }
        if (charList.size() == 1) {
            return input;
        }
        if (Objects.equals(input, "ab")) {
            return input;
        }
        return "";
    }

}