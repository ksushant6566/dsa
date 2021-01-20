package dsa;
import java.util.*;

public class NextGreaterToRight {

	public static void main(String[] args) {
		
		int[] arr = {4, 6, 2, 6, 8, 1, 0 };
		int[] ans = solve(arr);
		
		for(int i=0; i<ans.length; i++) System.out.println(ans[i]);
	}
	
	public static int[] solve(int[] arr) {
	        
	        Stack<Integer> st = new Stack<Integer>();
	        
	        int[] res = new int[arr.length];
	        
	        for(int i = arr.length-1; i >= 0; i--) { 
	            st.push(arr[i]);
	        }
	        
	        int i=0;
	        while(!st.isEmpty()) {
	            int curr = st.pop();
	            Stack<Integer> newSt = new Stack<>();
	            
	            while(!st.isEmpty() && curr >= st.peek()) {
	                newSt.push(st.pop());
	            }
	            
	            res[i++] = st.isEmpty() ? -1 : st.peek();
	            
	            while(!newSt.isEmpty()) st.push(newSt.pop());
	        }
	        
	        return res;
	    }

}
