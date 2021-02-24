package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class sugar {
	
	static int[] type = new int[] {3,5};
	static int[] dp;
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int target = Integer.parseInt(br.readLine());
		
		
		dp = new int[target+1];
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		dp[0] = 0;
		
		for (int i = 0; i < type.length; i++) {
			for (int j = type[i]; j < dp.length; j++) {
				if(dp[j-type[i]] != Integer.MAX_VALUE) {
					dp[j] = Math.min(dp[j], dp[j-type[i]]+1);
				}
			}
		}
		
		if(dp[target]!=Integer.MAX_VALUE) System.out.println(dp[target]);
		else System.out.println(-1);
		
  
	}

}
