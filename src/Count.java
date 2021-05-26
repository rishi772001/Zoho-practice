package com.rishi;/*

Find the occurrence of a number and display the values in ascending order of the given input

Ex input  3 4 3 4 1 2 3 1 2

Output 2 2 3 2

 */

import java.util.Arrays;
import java.util.HashMap;

public class Count {
    public static void main(String[] args) {
        int arr[] = {3, 4, 3, 4, 1, 2, 3, 1, 2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr)
        {
            if(map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }

        Integer keys[] = map.keySet().toArray(new Integer[0]);
        Arrays.sort(keys);

        for(Object i: keys)
        {
            System.out.print(map.get(i));
        }
    }
}
