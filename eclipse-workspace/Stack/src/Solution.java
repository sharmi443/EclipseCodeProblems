import java.util.*;

class Solution{
	
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()){
        Stack<Character> stack = new Stack<>();            
		String line = sc.nextLine() ;     
		for (char c : line.toCharArray()) {         
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            } else if (c == '}' ) {
            		if (!(stack.empty()) && stack.peek() == '{') {
            			stack.pop();
            		} else {
            			stack.push(c);
            		}
                continue;
            } else if (c == ')') {
            	if (!(stack.empty()) && stack.peek() == '(') {
                   stack.pop();
            	} else {
            		stack.push(c);
            	}
                continue;     
            } else if (c == ']') {
            	if (!(stack.empty()) && stack.peek() == '[') {
            		stack.pop();
            	} else {
            		stack.push(c);
            	}
                continue;
            } 
        }

        if(stack.empty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }   
        }
    }
}