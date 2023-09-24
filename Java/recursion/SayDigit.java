package recursion;
//Input: 412,
//Output: four one two
public class SayDigit {
    public static void main(String[] args) {
        int n = 412;
        String ans = sayDigit(n, "");
        System.out.println(ans);
    }

    private static String sayDigit(int n, String s) {

        if(n==0){
            return s;
        }
        s = sayDigit(n/10,s) + convToString(n%10) + " ";
        return s;

    }

    private static String convToString(int num){
        return switch (num) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> null;
        };
    }
}
