package recursion;

import java.util.HashMap;
import java.util.HashSet;

public class AllSubstring {
    public static void main(String[] args) {
        String A = "122321";
        //HashMap<Character,Integer>
        HashMap<Character,Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < A.length(); i++) {
             String s = "";
             int max = 0;
             for (int j = i; j < A.length(); j++) {
                 char c = A.charAt(j);
                 map.merge(c,1,Integer::sum);
                 s = s + A.charAt(j);
                 if(max < c - '0'){
                     max = c - '0';
                 }
                 if( map.get(c)<max){
                     //map.merge(c,1,Integer::sum);
                     System.out.println(s);
                     set.add(s);
                 }
            }
            map.clear();
        }
        String arr[] = new String[10];
        System.out.println(set);
    }
}
