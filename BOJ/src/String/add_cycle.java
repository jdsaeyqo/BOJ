package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class add_cycle {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		String ans = String.valueOf(n);
		
		if( n < 10) {
			
			ans+="0";
				
		}
		
		String s = ans;
	
			while(true) {
				
				int x = s.charAt(0) - '0';
				int y = s.charAt(1) - '0';
				
				
				String sum = String.valueOf(x+y);
				
				
				s = String.valueOf(y) + sum.charAt(sum.length()-1);
				
				
				cnt++;
				
				if(s.equals(ans)) break;
			}
			
			wr.write(String.valueOf(cnt));
		
		
		
		
		wr.flush();

	}
}
