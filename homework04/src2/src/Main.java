import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String arrows = ">>-->><<--<<>>-<><>-->>--><<--<--<<";

        Pattern pattern = Pattern.compile(">>-->|<--<<");
        Matcher mat = pattern.matcher(arrows);

        int counter = 0;

        while (mat.find()) {
            counter++;
        }
        System.out.println(counter);


    }
}