package stringMethods;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Pranav";
        String[] ch = s.toLowerCase().split("");
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
    }
}
