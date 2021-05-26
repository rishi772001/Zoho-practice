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
public class FloodFill {
    public static void flood(int[][] a, int curr, int x, int y, int color)
    {
        if(x < 0 || y < 0 || x >= a.length || y >= a[0].length)
            return;
        if(a[x][y] == curr)
        {
            a[x][y] = color;
            flood(a, curr, x - 1, y, color);
            flood(a, curr, x, y - 1, color);
            flood(a, curr, x + 1, y, color);
            flood(a, curr, x, y + 1, color);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int a[][] = new int[m][n];
//        
//        int x = sc.nextInt(), y = sc.nextInt(), color = sc.nextInt();

        int a[][] = {{ 1, 1, 1, 1, 1, 1, 1, 1 },
                          { 1, 1, 1, 1, 1, 1, 0, 0 },
                          { 1, 0, 0, 1, 1, 0, 1, 1 },
                          { 1, 2, 2, 2, 2, 0, 1, 0 },
                          { 1, 1, 1, 2, 2, 0, 1, 0 },
                          { 1, 1, 1, 2, 2, 2, 2, 0 },
                          { 1, 1, 1, 1, 1, 2, 1, 1 },
                          { 1, 1, 1, 1, 1, 2, 2, 1 },};
        int n = 8, m = 8, x = 4, y = 4, color = 3;
        flood(a, a[x][y], x, y, color);
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {  
             System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
            
}
