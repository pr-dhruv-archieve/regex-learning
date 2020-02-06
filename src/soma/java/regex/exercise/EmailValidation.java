package soma.java.regex.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String email = sc.next();

        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_.-]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher matcher = p.matcher(email);

        if(matcher.find() && matcher.group().equals(email))
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");

        sc.close();
    }
}
