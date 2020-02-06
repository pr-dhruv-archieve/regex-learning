package soma.java.regex.exercise;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListTxtFile {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9$._]+[.]txt");
        Matcher matcher = null;
        File folder = new File("C:\\Users\\mahendra.prajapati\\Documents");

        int count= 0;
        for(String file : folder.list()) {
            matcher = pattern.matcher(file);
            if(matcher.find() && matcher.group().equals(file)) {
                System.out.println(file);
                count++;
            }
        }
        System.out.println(count);
    }

}
