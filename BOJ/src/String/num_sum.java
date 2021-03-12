package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class num_sum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		
		int sum = 0;
		for (int i = 0; i  <n; i++) {
			sum+=s.charAt(i) - '0';
			
		}
		
		wr.write(String.valueOf(sum));
		
		wr.flush();
	}
}
