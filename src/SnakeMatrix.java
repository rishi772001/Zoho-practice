package com.rishi;

public class SnakeMatrix {
    public static void main(String[] args) {
        int k = 10, row = 3;
        int col = k / row + 1;

        int[][] matrix = new int[row][col];

        int val = 1, i = 0, j = 0;
        // go top to bottom
        boolean flag = true;
        while(val <= k && j < col)
        {
            while(val <= k && i >= 0 && i < row)
            {
                matrix[i][j] = val;
                val++;
                if(flag)
                    i++;
                else
                    i--;
            }
            if(i >= row) i = row -1;
            if(i < 0) i = 0;
            flag = !flag;
            j++;
        }

        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                if(matrix[i][j] != 0) System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
