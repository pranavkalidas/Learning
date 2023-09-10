package recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 45;
        int ansByDP = factorialByDp(n);
        int ansByRecursion = factorialByRecursion(n);
        System.out.println("Recursion: "+ansByRecursion);
        System.out.println("DP: "+ansByDP);
    }

    private static int factorialByRecursion(int n) {
        if(n==0 || n==1)
            return 1;
        return n*factorialByRecursion(n-1);
    }

    private static int factorialByDp(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=1; i<=n; ++i){
            dp[i] = (int) ((dp[i-1] * i) % Math.pow(10,7));
        }
        return dp[n];
    }
}
