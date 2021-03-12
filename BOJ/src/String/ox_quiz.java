package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ox_quiz {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] res = new int[n];
		
		
			for (int i = 0; i < n; i++) {
			
			String str = br.readLine();
			int[] ans = new int[str.length()];
			if(str.charAt(0) == 'O') {
				ans[0] = 1; 
			}else {
				ans[0] = 0;
			}
			
			int sum = ans[0];
			for (int j = 1; j < str.length(); j++) {
				
				if(str.charAt(j) == 'O' && str.charAt(j-1) == 'O') {
					ans[j] = ans[j-1]+1;
					sum+=ans[j];
				}else if(str.charAt(j) == 'O' && str.charAt(j-1) == 'X') {
					ans[j] = 1;
					sum+=ans[j];
				}else {
					ans[j] = 0;
					sum+=ans[j];
				}
			}
			
			res[i] = sum;

		}
			
			for (int i = 0; i < res.length; i++) {
				wr.write(String.valueOf(res[i]));
				wr.newLine();
			}
			wr.flush();
		
		
	}
}
