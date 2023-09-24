package stringMethods;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "";
        System.out.println(s.length());

        //Split
        String[] ch = s.toLowerCase().split("");
       // System.out.println(Arrays.toString(ch));
       // System.out.println(ch.length);


        /*indexOf*/
        char[] arr = s.toCharArray();
       // System.out.println(s.indexOf('V',58));

        StringBuilder str = new StringBuilder("13019173019");
        String pat = "3019";

        System.out.println(str.substring(2,11).indexOf(pat));
        System.out.println(str.substring(2,11));

        System.out.println((int)'0');
    }
}
