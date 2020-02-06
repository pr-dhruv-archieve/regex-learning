package soma.java.regex;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstProgram {

    public static void main(String[] args) {
	    String string= "abbabbba";
        int count = 0;
        /**
         * First We need to compile the pattern into Java that will return a Pattern object for that regex
         */
        Pattern pattern = Pattern.compile("ab");

        /**
         * Now we are going to find the pattern in the string, it is going to return the matcher patter
         * Using this matcher patter we are going to iterate all the matches.
         */
        Matcher matcher = pattern.matcher(string);

        /**
         * matcher.find() => returns true if pattern is found otherwise it return false
         */
        while(matcher.find()) {
            count++;
            /**
             * matcher.start()  => return the starting index of the pattern
             * matcher.end()    => return the ending index of the pattern
             * matcher.group()  => return the string which matches the pattern
             */
            System.out.println(matcher.start() + "->" + matcher.end() + " => " + matcher.group());
        }

        System.out.println("Count : " + count);
    }
}
