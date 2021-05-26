package com.rishi;

public class SubsetSum {
    public static boolean subsetSum(int[] arr, int start, int n, int sum)
    {
        if(sum == 0){
            return true;
        }

        if(start == n || sum < 0)
            return false;

        return subsetSum(arr, start + 1, n, sum) || subsetSum(arr, start, n, sum - arr[start]);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int n = 3;
        System.out.println(subsetSum(arr, 0, arr.length - 1, n));
    }
}
