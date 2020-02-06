package soma.java.regex.exercise;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberVerifier {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String number = sc.next();

        //Pattern p = Pattern.compile("(0|91)?[-]?[6-9][0-9]{9}");
        Pattern p = Pattern.compile("(0|\\+91)?[-]?[6-9][0-9]{9}");
        Matcher matcher = p.matcher(number);

        if(matcher.find())
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");

        sc.close();
    }
}
