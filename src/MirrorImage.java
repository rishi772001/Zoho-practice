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
public class MirrorImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++)
        {
            // space
            for(int j = i; j < n; j++)
            {
                System.out.print(" ");
            }
            //1st half
            for(int j = i - 1; j >= 0; j--)
            {
                System.out.print(j);
            }
            // second half
            for(int j = 1; j < i; j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
