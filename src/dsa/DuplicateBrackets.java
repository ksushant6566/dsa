package dsa;
import java.util.*;

public class DuplicateBrackets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        String exp = sc.nextLine();
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<exp.length(); i++) {
            char ch = exp.charAt(i);
            
            if(ch != ')') {
                s.push(ch);
            }else {
                if(s.peek() == '(') {
                    System.out.println(true);
                    return ;
                }else {
                    while(s.peek() != '(') {
                        s.pop();
                    }
                    s.pop();
                }
            }
        }
        System.out.println(false);

	}

}
