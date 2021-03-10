package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class wine {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [] amount = new int[n+2];
		
		for (int i = 2; i < n+2; i++) {
			amount[i] = Integer.parseInt(br.readLine());
		}
		
		int[]dp1 = new int[n+2];
		int[]dp2 = new int[n+2];
		
		dp1[0] = 0;
		dp1[1] = 0;
		dp1[2] = 0;
		dp2[0] = 0;
		dp2[1] = 0;
		dp2[2] = amount[2];
		
		if(n == 1) {
			System.out.println(amount[2]);
		}
		else {
		int max = 0;
		for (int i = 3; i < n+2; i++) {
			dp1[i] = dp2[i-1] + amount[i];
			dp2[i] = Math.max(Math.max(dp1[i-2], dp2[i-2]), Math.max(dp1[i-3], dp2[i-3])) + amount[i];
			
			int ans = Math.max(Math.max(dp1[i], dp2[i]), max);
			
			max = ans;
			
		}
		
		System.out.println(max);
		
	}
}
}
