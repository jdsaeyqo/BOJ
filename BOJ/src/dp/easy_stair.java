package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class easy_stair {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Long[] dp = new Long[n];
		dp[0] = (long) 9;
		
		if(n == 1) {
			System.out.println(dp[0]);
			
		}else {
			
			for (int i = 1; i < dp.length; i++) {
				dp[i] = (dp[i-1] * 2 - i) % 1000000000;
			}
			
			System.out.println(dp[n-1]);
		}

		
	}
}
