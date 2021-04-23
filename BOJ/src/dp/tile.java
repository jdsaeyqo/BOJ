package dp;

import java.io.BufferedReader;

/*


 */
import java.io.IOException;
import java.io.InputStreamReader;

public class tile {
	
	
	
	static int n;
	static int[] ans;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		ans = new int[n+1];
		ans[0] = 1;
		ans[1] = 1;
		
		for (int i = 2; i < ans.length; i++) {
			ans[i] =(ans[i-2]+ans[i-1])%10007;
		}
		
		
		
		System.out.println(ans[n]);
		
	}

}
