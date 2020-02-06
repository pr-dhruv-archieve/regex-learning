package soma.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedCharacterClasses {
    public static void main(String[] args) {
        String string = "a7b k@9z";
        String[] regexList = new String[]{
                "\\s", "\\S", "\\d", "\\D", "\\w", "\\W", "."
        };

        Pattern pattern = null;
        Matcher matcher = null;

        for (String regex : regexList) {
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(string);

            System.out.println("Searching for pattern : " + regex);
            while (matcher.find()) {
                System.out.println(matcher.start() + "->" + matcher.end() + " => " + matcher.group());
            }
            System.out.println("========================================================");
        }
    }
}
