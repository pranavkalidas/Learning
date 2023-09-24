package recursion;

public class SumOfAllElements {
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,8};
        System.out.println("SUM: "+sumOfElements(arr,arr.length));
    }

    private static int sumOfElements(int[] arr, int length) {
        if(length-1==0){
            return arr[0];
        }
       return arr[length-1] + sumOfElements(arr,length-1);
    }
}
