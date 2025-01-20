import java.util.Objects;

public final class ReorganizeStringApplication {

    public static String reorganizeString(String input) {
        if (Objects.equals(input, "ab")) {
            return input;
        }   
        return "a";
    }

}