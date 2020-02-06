package soma.java.regex.exercise;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMobileNumberFromFile {

    public static void main(String[] args) throws IOException {
        Pattern p = Pattern.compile("(0|\\+91|91)?[-]?[6-9][0-9]{9}");
        Matcher matcher = null;
        PrintWriter out = new PrintWriter("output.txt");
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line = reader.readLine();
        while(line != null) {
            matcher = p.matcher(line);
            while(matcher.find()) {
                String number = matcher.group();
                System.out.println(number);
                out.println(number);
            }
            line = reader.readLine();
        }
        out.flush();
        out.close();
        reader.close();
    }

}
