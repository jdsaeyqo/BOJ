package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stair {
	
	static int[] score;
	static int[] dp1;
	static int[] dp2;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		score = new int[num];
		dp1 = new int[num];
		dp2 = new int[num];
		
		for (int i = 0; i < num; i++) {
			 score[i] = Integer.parseInt(br.readLine());
		}
		
		
		dp1[0] = score[0];
		if(num == 1) System.out.println(dp1[0]);
		
		else {
			dp1[1] = score[0] + score[1];
			
			dp2[0] = 0;
			dp2[1] = score[1];
			
			
			{
				for (int i = 2; i < num; i++) {
					dp1[i] = score[i] + dp2[i-1];
					dp2[i] = score[i] + Math.max(dp1[i-2], dp2[i-2]);
				}
				
				System.out.println(Math.max(dp1[num-1], dp2[num-1]));
		}
		
		}
		
		
		
	}
}
