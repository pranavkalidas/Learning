package recursion;

/*
For an set {1, 2, 3}
Power set is:{ {}, {1}, {2}. {3}, {1,2}, {1,3}, {2,3}, {1,2,3} }
 */

//NOT WORKING!!!!!!!
import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(powerSet(arr));
    }

    private static List<List<Integer>> powerSet(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> subList = new ArrayList<>();

        helperPowerSet(arr,list,subList,0);

        return list;
    }

    private static void helperPowerSet(int[] arr, List<List<Integer>> list, List<Integer> subList, int index) {
        if(index >= arr.length){
            ArrayList<Integer> temp = new ArrayList<>(subList);
            list.add(temp);
            return;
        }

        //exclude
        helperPowerSet(arr,list,subList, index+1);

        //include
        subList.add(arr[index]);

        helperPowerSet(arr,list,subList,index+1);
    }
}
