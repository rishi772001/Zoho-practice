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
public class XShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int n = inp.length();
        int i;
        
        for(i = 0; i < n / 2; i++)
        {
            if(Character.isDigit(inp.charAt(i)))
            {
                int left = Character.getNumericValue(inp.charAt(i));
                int right = Character.getNumericValue(inp.charAt(n - 1 - i));
                
                // starting space
                for(int j = 0; j < i; j++)
                {
                    System.out.print(" ");
                }
                // number
                System.out.print(left);
                // between space
                for(int j = 0; j < (n - 1 - i - i); j++)
                {
                    System.out.print(" ");
                }
                // number
                System.out.print(right);
                System.out.println("");
            }
            else
            {
                char left = inp.charAt(i);
                char right = inp.charAt(n - 1 - i);
                // starting space
                for(int j = 0; j < i; j++)
                {
                    System.out.print(" ");
                }
                // number
                System.out.print(left);
                // between space
                for(int j = 0; j < (n - 1 - i - i); j++)
                {
                    System.out.print(" ");
                }
                // number
                System.out.print(right);
                System.out.println("");
            }
            
        }
        for(int j = 0; j < i; j++)
        {
                System.out.print(" ");
        }
        System.out.print(inp.charAt(i++));
        System.out.println("");
        
        
        for(; i < n; i++)
        {
            if(Character.isDigit(inp.charAt(i)))
            {
                int left = Character.getNumericValue(inp.charAt(i));
                int right = Character.getNumericValue(inp.charAt(n - 1 - i));
                
                // starting space
                for(int j = 0; j < (n - 1 - i); j++)
                {
                    System.out.print(" ");
                }
                // number
                System.out.print(right);
                // between space
                for(int j = 0; j < (left - right); j++)
                {
                    System.out.print(" ");
                }
                // number
                System.out.print(left);
                System.out.println("");
            }
            else
            {
                char left = inp.charAt(i);
                char right = inp.charAt(n - 1 - i);
                
                // starting space
                for(int j = 0; j < (n - 1 - i); j++)
                {
                    System.out.print(" ");
                }
                // number
                System.out.print(right);
                // between space
                for(int j = 0; j < (i - (n - i - 1)); j++)
                {
                    System.out.print(" ");
                }
                // number
                System.out.print(left);
                System.out.println("");
            }
            
        }
    }
}
