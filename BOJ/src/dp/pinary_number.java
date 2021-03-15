package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pinary_number {
	
	static long cnt = 0;
	static int num ;
	
	public static void main(String[] args) throws NumberFormatException, IOException {

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				 num = Integer.parseInt(br.readLine());
				 Long[] ans = new Long[num+1];
				 
				 ans[0] = (long) 0;
				 ans[1] = (long) 1;
				 if(num == 1) {
					 System.out.println(ans[1]);
				 }else {
					 for (int i = 2; i < ans.length; i++) {
							ans[i] = ans[i-2] + ans[i-1];
							 }
					 
					 System.out.println(ans[num]);
				 }

			}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
