/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
 */

import java.util.Stack;

public class Stack_ValidParantheses {
	public boolean isValid(String s) {
        int length = s.length();
       
        Stack <Character> stack = new Stack <Character>() ;
        for (int i =0 ; i < length ; i++)
        {
           if (s.charAt(i) == '(')
           {
               stack.push(')');
           }
           else if (s.charAt(i) == '[')
           {
             stack.push(']');
           }
           else if (s.charAt(i)== '{')
           {
               stack.push('}');
           }

            else 
            {
                if (stack.isEmpty())
                {
                    return false;
                }
                char top = stack.peek();
                if (s.charAt(i) == top)
                {
                 stack.pop();
                
                }
                else 
                {
                    return false ;
                }
            }


        }

        return stack.isEmpty() ;
        
    }
}
