package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
S = "abc"
ans = { a, ab, abc, bc, ac, b, c }
 */
public class SubSequenceString {
    public static void main(String[] args) {
        String s = "122321";
        int[] nums = {1,2,2,3,2,1};
        //System.out.println(subSequence(s));
        System.out.println(subsets(nums));
    }

    private static List<String> subSequence(String s) {
        List<String> finalList = new ArrayList<>();
        helperSubSequence(s, s.length()-1, "", finalList);
        return finalList;
    }

    private static void helperSubSequence(String s, int length, String subSequence, List<String> ansList) {
        if(length < 0){
            if(!subSequence.isEmpty())
                ansList.add(subSequence);
            return;
        }

        //exclude
        helperSubSequence(s,length-1,subSequence,ansList);

        //include
        subSequence = subSequence + s.charAt(length);
        helperSubSequence(s,length-1,subSequence,ansList);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int n : nums){
            int size = result.size();
            for(int i=0; i<size; i++){
               // System.out.println("***"+result.get(i));
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(n);
               // System.out.println(subset);
                result.add(subset);
            }
        }
        return result;
    }

}
