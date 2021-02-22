package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class cnt{
	int zero;
	int one;
	
	public cnt(int zero, int one) {
		this.zero = zero;
		this.one = one;
	}
    
	public int getZero() {
		return zero;
	}

	public int getOne() {
		return one;
	}

	@Override
	public String toString() {
		
		return this.zero +" "+this.one;
	}
}

public class fibonacci {
	
	static cnt[] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			
			dp = new cnt[n+1];
			
			dp[0] = new cnt(1,0);
			
			if( n == 0 ) {
				System.out.println(dp[0]);
			}else {
				dp[1] = new cnt(0,1);
				if(n==1) {
					System.out.println(dp[n]);
				}else {
					for (int j = 2; j < dp.length; j++) {
						dp[j] = new cnt(dp[j-2].getZero()+dp[j-1].getZero(),
										dp[j-2].getOne()+dp[j-1].getOne());
						
					}
					
					
					System.out.println(dp[n]);
				}
					
				
				
				
			}

		}
		
		}

}