package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class word_study {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine().toLowerCase();
		
		int[] res = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			
			int idx = str.charAt(i) - 'a';
			
			res[idx]++;
					
		}
		
		int max = 0;
		int idx = 0;
		for (int i = 0; i < res.length; i++) {
						
			if(res[i] > max) {
				max = res[i];
				idx = i;
			}
			
		}

		Arrays.sort(res);
		
		if(res[res.length-1] == res[res.length-2]) {
			wr.write("?");
		}else {
			char c = (char) ('A' + idx);
			wr.write(c);
		}
		
		wr.flush();
}
}
