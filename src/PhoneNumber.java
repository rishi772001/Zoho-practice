package com.rishi;

/*
Phone number should have + at 1st and should have 2 numbers and a hypen – and 10 numbers 1st 6
numbers should replace with 5 stars..
In the 10 number can have – or () it can be negligible

Example input +91-1234567890

Output +91-7890

+91-(123)(234)(6789)

+91-6789

 */
public class PhoneNumber {
    public static void main(String[] args) {
        String inp = "+91-1234567890";
        char arr[] = inp.toCharArray();

        if(arr[0] != '+')
            System.out.println("Invalid number");
        else if(arr[1] < 48 || arr[1] > 57 || arr[2] < 48 || arr[2] > 57)
            System.out.println("Invalid number");
        else if(arr[3] != '-')
            System.out.println("Invalid number");
        else{
            int c = 0;
            for(int i = 0; i < arr.length; i++)
            {
                if(i <= 3 )
                    System.out.print(arr[i]);
                else {
                    boolean isChar = arr[i] != '(' && arr[i] != ')' && arr[i] != '-';
                    if(isChar && c < 6) {
                        System.out.print('*');
                        c++;
                    }
                    else if(isChar){
                        System.out.print(arr[i]);
                    }
                }
            }
        }

    }
}
