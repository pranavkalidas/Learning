package recursion;

public class CheckIfSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,5,6,7,8};
        System.out.println(isSortedArray(arr,arr.length));
    }

    private static boolean isSortedArray(int[] arr, int length) {
        if(length==0 || length==1){
            return true;
        }
        if(arr[length-1]<arr[length-2]){
            return false;
        }
        return isSortedArray(arr, length-1 );
    }
}
