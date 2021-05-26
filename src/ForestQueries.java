package com.rishi;//https://cses.fi/problemset/task/1652

import java.util.*;
public class ForestQueries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First line input
        String nq = sc.nextLine();
        String nq_arr[] = nq.split(" ");
        int n = Integer.parseInt(nq_arr[0]);
        int q = Integer.parseInt(nq_arr[0]);



        // Next n lines for forest
        char forest[][] = new char[n][n];
        for(int i = 0; i < n; i++)
        {
            forest[i] = sc.nextLine().toCharArray();
        }

        // Get queries and process
        for(int i = 0; i < q; ++i)
        {
            String query[] = sc.nextLine().split(" ");
            int y1 = Integer.parseInt(query[0]) - 1;
            int x1 = Integer.parseInt(query[1]) - 1;
            int y2 = Integer.parseInt(query[2]) - 1;
            int x2 = Integer.parseInt(query[3]) - 1;

            int count = 1;
            for(int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
