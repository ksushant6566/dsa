package dsa;
import java.util.Stack;
import java.util.Scanner;


public class BalancedBrackets {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Character> stack = new Stack<>();
		
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			}else {
				if(stack.isEmpty()) {
					System.out.println("not balanced");
					return;
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
					return;
				}
			}
		}
		
		System.out.println(stack.isEmpty() ? "balanced" : "not balanced");
	}
}
