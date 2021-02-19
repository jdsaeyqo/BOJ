package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class change {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int money = 1000 - Integer.parseInt(st.nextToken());
		
		int[] coin = {500,100,50,10,5,1};
		
		
		int cnt = 0;
		
		while(money != 0) {
			for (int i = 0; i < coin.length; i++) {
				if(money >= coin[i]) {
					cnt+= money/coin[i];
						money%=coin[i];
				}
			}
		}
		
		System.out.println(cnt);
	}

}
