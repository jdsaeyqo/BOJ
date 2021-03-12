package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class num_cnt {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] cnt = new int[10];
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int num = a * b * c;
		
		String str = String.valueOf(num);
		
		for (int i = 0; i < str.length(); i++) {
			
			int idx = str.charAt(i) - '0';
			cnt[idx]++;

		}
		
		
		for (int i = 0; i < cnt.length; i++) {
			wr.write(String.valueOf(cnt[i]));
			wr.newLine();
		}
		
		wr.flush();
	}
}
