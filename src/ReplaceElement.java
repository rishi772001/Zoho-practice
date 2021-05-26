/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rishi;

import java.util.Scanner;

/**
 *
 * @author rishi
 */
public class ReplaceElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = {16, 17, 4, 3, 5, 2};
        
        int max = arr[n - 1];
        for(int i = n - 2; i >= 0; i--)
        {
            int temp = arr[i];
            arr[i] = max;
            max = Integer.max(max, temp);
        }
        arr[n - 1] = -1;
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
