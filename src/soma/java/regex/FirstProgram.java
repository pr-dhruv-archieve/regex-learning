package soma.java.regex;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstProgram {

    public static void main(String[] args) {
	    String string= "abbabbba";
        int count = 0;
	    // First We need to compile the pattern into Java that will return a Pattern object for that regex
        Pattern pattern = Pattern.compile("ab");

        /**
         * Now we are going to find the pattern in the string, it is going to return the matcher patter
         * Using this matcher patter we are going to iterate all the matches.
          */
        Matcher matcher = pattern.matcher(string);


        while(matcher.find()) {
            count++;
            System.out.println(matcher.start());
        }

        System.out.println("Count : " + count);
    }
}
