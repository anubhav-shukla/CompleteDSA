package DSA;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesisChecker2 {
	static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
            = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) 
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') 
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;

            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;

            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }}
		return true;
		}
     public static void main(String ar[]) {
    	 String n = "()";
    	 System.out.println(areBracketsBalanced(n));
     }
}

