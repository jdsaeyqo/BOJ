package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGBdist {
	

	static int[][] info;
	static int[][] dp;
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		
		info = new int[num][3];
		dp = new int[num][3];
		
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				info[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[0][0] = info[0][0];
		dp[0][1] = info[0][1];
		dp[0][2] = info[0][2];
		
		for (int i = 1; i < num; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + info[i][0];
			dp[i][1] = Math.min(dp[i-1][2], dp[i-1][0]) + info[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + info[i][2];
		}
				
		
		
		System.out.println(Math.min(Math.min(dp[num-1][0], dp[num-1][1]),dp[num-1][2]));
		
		
		
	}
			
		
}
