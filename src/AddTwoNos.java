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
public class AddTwoNos {
    public static String toString(int[] a)
    {
        String res = "";
        for(int i : a)
        {
            res += Integer.toString(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            b[i] = sc.nextInt();
        }
        int sum = Integer.parseInt(toString(a)) + Integer.parseInt(toString(b));
              
        System.out.println(sum);
    }
            
}
