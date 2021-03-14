package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class cnt_word {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sen = br.readLine();
		if(sen.equals(" ")) {
			wr.write(String.valueOf(0));
			
		}else {
			String s = sen.trim();
			String[] res = s.split(" ");
			
			wr.write(String.valueOf(res.length));
		}
		
		
		wr.flush();
		
	}
}
