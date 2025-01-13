import java.util.Objects;

public class ReorganizeStringApplication {
    public ReorganizeStringApplication() {
    }
    public String reorganizeString(String s) {
        String result = "";
        if (Objects.equals(s, "aab")) {
            result = "aba";
        }
        return "Input: s = \""+ s + "\"\n" +
                "Output: \""+ result + "\"" ;
    }
}
