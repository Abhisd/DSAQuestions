package HashMaps;

import java.util.*;

class Map {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(123, "Alex");
        hm.put(342, "Ryan");
        hm.put(143, "Joe");
        hm.put(234, "Allen");
        hm.put(432, "Roy");

        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.putAll(hm);

       // System.out.println(tm);
       int[] numbers = {1, 5, 4, 6, 7, 8, 9, 10, 11};
       System.out.println(Arrays.binarySearch(numbers, 4));
    }
}
