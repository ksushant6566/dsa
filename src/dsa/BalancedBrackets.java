package dsa;
import java.util.Stack;
import java.util.Scanner;


public class BalancedBrackets {

	public static boolean main(String [] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Character> stack = new Stack<>();
		
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			}else {
				if(stack.isEmpty()) {
					return false;
				}
				if(ch == ')' && stack.peek() == '(') {
					stack.pop();
				}else if(ch == '}' && stack.peek() == '{') {
					stack.pop();
				}else if(ch == ']' && stack.peek() == '[') {
					stack.pop();
				}
				else {
					System.out.println("not balanced");
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}
}
