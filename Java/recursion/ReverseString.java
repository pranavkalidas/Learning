package recursion;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Pranav";
        String ans = reverseString(s, 0,"");
        System.out.println(ans);
    }

    private static String reverseString(String s, int i, String newString) {
        if(i>=s.length())
            return newString;
        return reverseString(s,i+1,newString) + s.charAt(i);
    }
}
