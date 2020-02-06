package soma.java.regex.exercise;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMailIdFromFile {

    public static void main(String[] args) throws IOException {
        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_.-]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher matcher = null;
        PrintWriter out = new PrintWriter("outputMail.txt");
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
