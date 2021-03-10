package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class longest_increasing {
	
	static int N;
	static int[] num;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		num = new int[n+1];
		dp = new int[n+1];
	
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			
		}
		
		for (int i = 1; i < num.length; i++) {
			
			dp[i] = check(i) + 1;
			
		}
		
		Arrays.sort(dp);
		System.out.println(dp[dp.length-1]);
	
		
	}
	private static int check(int idx) {
		
		int max = -1;
		
		for (int i = 0; i < idx; i++) {
			
			if(num[i] < num[idx]) {
				if(dp[i] > max) {
					max = dp[i];
				}
			}
			
		}
		
		
		
		return max;
		
	}

}
