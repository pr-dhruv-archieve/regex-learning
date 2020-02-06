package soma.java.regex;

import java.util.regex.Pattern;

public class FirstProgram {

    public static void main(String[] args) {
	    String string= "abbabbba";

	    // First We need to compile the pattern into Java that will return a Pattern object for that regex
        Pattern pattern = Pattern.compile("ab");
    }
}
