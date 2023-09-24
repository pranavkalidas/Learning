package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 6};
        int key = 2;
        int index = linearSearchByRecursion(arr,key,arr.length);
        if(index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index: "+index);
        }
    }

    private static int linearSearchByRecursion(int[] arr, int key, int length) {
        if(length == 0){
            return -1;
        }

        if(arr[length-1] == key){
            return length -1;
        }

        return linearSearchByRecursion(arr,key,length-1);
    }
}
