package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        System.out.println(list.remove(0));
        System.out.println(list);

    }
}
