package dsa;
import java.util.*;

public class StcokSpan {
	public static void main(String[] args) {
			
		int[] arr = {4, 6, 2, 6, 8, 1, 0 };
		int[] ans = solve(arr);
		
		for(int i=0; i<ans.length; i++) System.out.println(ans[i]);
	}
	
	public static int[] solve(int[] arr) {
        int[] ans = new int[arr.length];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i< arr.length; i++) 
            st.push(arr[i]);
        
        int i=arr.length-1;
        while(!st.isEmpty()) {
            int count = 1;
            int curr = st.pop();
            Stack<Integer> newSt = new Stack<Integer>();
            
            while(!st.isEmpty() && st.peek() <= curr) {
                newSt.push(st.pop());
                count++;
            }
            
            ans[i--] = count;
            
            while(!newSt.isEmpty()) 
                st.push(newSt.pop());
            
        }
        
        return ans;
    }
}
