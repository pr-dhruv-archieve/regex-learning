package soma.java.regex;

import java.util.regex.Pattern;

public class PatternSplit {
    public static void main(String[] args) {
        String line = "My name is Mahendra Prajapati";
        Pattern pattern = Pattern.compile("\\s");

        for (String word : pattern.split(line)) {
            System.out.println(word);
        }
        System.out.println("=========================================");
        line = "www.mahendraprajapati.com";
        pattern = Pattern.compile("\\.");
        Pattern p2 = Pattern.compile("[.]");
        for (String word : pattern.split(line)) {
            System.out.println(word);
        }
        System.out.println("------------------------");
        for (String word : p2.split(line)) {
            System.out.println(word);
        }

    }
}
