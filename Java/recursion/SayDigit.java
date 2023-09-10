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
        switch (num){
            case 0 : return "zero";
            case 1 : return "one";
            case 2 : return "two";
            case 3 : return "three";
            case 4 : return "four";
            case 5 : return "five";
            case 6 : return "six";
            case 7 : return "seven";
            case 8 : return "eight";
            case 9 : return "nine";
        }
        return null;
    }
}
