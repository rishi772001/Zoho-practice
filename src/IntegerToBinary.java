package com.rishi;

public class IntegerToBinary {
    public static String convert(int n, String ans) {
        if(n > 0)
            return convert(n / 2, ans + (n % 2));

        else
            return ans;
    }
    public static void main(String[] args) {
        int n = 14;
        System.out.println(new StringBuilder(convert(n, "")).reverse());
    }
}
