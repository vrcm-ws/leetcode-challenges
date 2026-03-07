import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class TEst
{
    public static void main(String[] args) {

        String input = "tre tre tre uio snf";

        List<String> word = new ArrayList<>();


        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
