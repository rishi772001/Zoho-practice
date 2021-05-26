package com.rishi;

import java.util.Arrays;

public class ReplaceMaxi {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int maxi = -1;

        for(int i = arr.length - 1; i >= 0; i--)
        {
            int temp = maxi;
            maxi = Math.max(maxi, arr[i]);
            arr[i] = temp;

        }

        System.out.println(Arrays.toString(arr));
    }
}
