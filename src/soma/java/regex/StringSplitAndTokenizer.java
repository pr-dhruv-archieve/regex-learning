package soma.java.regex;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.StringTokenizer;

public class StringSplitAndTokenizer {
    public static void main(String[] args) {
        /**
         * String class split() method takes regex as the argument
         */
        String line = "My name is Mahendra Prajapati";
        for (String word : line.split("\\.")) {
            System.out.println(word);
        }
        System.out.println("--------------------------");
        System.out.println("========Tokenizer=========");

        StringTokenizer st =new StringTokenizer(line);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println("--------------------------");
        st =new StringTokenizer("06-02-2020", "-");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }


    }
}
