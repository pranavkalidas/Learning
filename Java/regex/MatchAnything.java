package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchAnything {
    public static void main(String[] args) {
        String s = "Pranav is a good man";
        String regex = " ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        matcher.results().forEach(System.out::println);
    }
}
