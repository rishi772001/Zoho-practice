/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rishi;
import java.util.*;
/**
 *
 * @author rishi
 */
public class Josephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = i;
        }
        
        int i = 0;
        int counter = 0;
        int ans = 0;
        while(ans < n - 1)
        {
            if(arr[i] != -1)
                counter++;
            if(counter == k)
            {
                arr[i] = -1;
                counter = 0;
                ans++;
            }
            i++;
            i = i % arr.length;
        }
        for(i = 0; i < arr.length; i++)
        {
            if (arr[i] != -1) {
                System.out.println(arr[i] + 1);
                System.exit(0);
            }
        }
    }
}
