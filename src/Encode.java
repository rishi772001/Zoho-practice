package com.rishi;

import java.util.*;

/**

Alphabets are inside () and the number -9<=0>=9 which is under{} solve the string according to the sample input output

Input (z){-2}oho

Output ZZoho

Input ((x){2}(y){3}(z)){2}

Output xxyyyzxxyyyz

*/

/*

ALGORITHM

1. create stack
2. iterate input
3. push to stack if i is ( or i is alphabet
4. if i is ) pop from stack until ( is found and store it in "currChar"
5. if i is { iterate till } to find the "currNum"
6. push currChar back to stack for currNum times
7. print stack

 */

public class Encode {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        int i = 0;

        String currChar = "";
        String currNum = "";

        // iterate the input string
        while(i < chars.length)
        {
            // push to stack
            if(chars[i] == '(')
                stack.push(chars[i]);

            // pop from stack and store it in currChars
            else if(chars[i] == ')' && chars[i + 1] == '{')
            {
                while(stack.peek() != '(')
                {
                    currChar += stack.pop();
                }
                // remove one open bracket
                stack.pop();
            }

            // remove the open bracket pushed before if not { bracket found
            else if(chars[i] == ')')
            {
                Stack<Character> temp = new Stack<>();
                while(stack.peek() != '(')
                {
                    temp.add(stack.pop());
                }
                stack.pop();
                while(!temp.isEmpty())
                {
                    stack.push(temp.pop());
                }
            }

            // find number
            else if(chars[i] == '{')
            {
                i++;
                while(chars[i] != '}')
                {
                    if(chars[i] != '-')
                        currNum += chars[i];
                    i++;
                }

                StringBuilder temp = new StringBuilder(currChar);
                temp.reverse();
                currChar = temp.toString();

                // push back to stack n times
                for (int j = 0; j < Integer.parseInt(currNum); j++) {
                    for (int k = 0; k < currChar.length(); k++) {
                        stack.push(currChar.charAt(k));
                    }
                }

                // reset vaiables
                currChar = "";
                currNum = "";
            }

            // push to stack if it is alphabet
            else if(chars[i] >= 'a' && chars[i] <= 'z' || chars[i] >= 'A' && chars[i] <= 'Z'){
                stack.push(chars[i]);
            }
            i++;
        }

        // print stack in reverse
        String output = "";
        while(!stack.isEmpty())
        {
            output += stack.pop();
        }
        System.out.println(new StringBuilder(output).reverse());
    }
}
