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
public class LatinSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int j = n - i; j < n; j++ )
            {
                System.out.print(j + 1);
            }
            for(int j = 1; j <= n - i; j++ )
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
