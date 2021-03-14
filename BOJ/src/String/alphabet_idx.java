package String;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class alphabet_idx {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		int[]res = new int[26];
		for (int i = 0; i < res.length; i++) {
			res[i] = -1;
		}
		
		
		for (int i = 0; i < str.length(); i++) {
			int idx = str.charAt(i) - 'a';
			
			if(res[idx] == -1) {
				res[idx] = i;
			}
			
			
		}
		
		for (int i = 0; i < res.length; i++) {
			
			wr.write(String.valueOf(res[i])+" ");
		}
		wr.flush();
		
	}
}
