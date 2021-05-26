package com.rishi;

import java.util.Arrays;

public class PermutationsOfString {
    static int count = 0;
    public static void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void permute(char[] str, int l, int r) {
        if(l == r){
            System.out.println(Arrays.toString(str));
            count++;
        }

        for(int i = l; i < r; i++)
        {
            swap(str, i, l);
            permute(str, l + 1, r);
            swap(str, i, l);
        }
    }
    public static void main(String[] args) {
        String str = "rishi";
        char[] arr = str.toCharArray();
        permute(arr, 0, arr.length);
        System.out.println(count);
    }
}
