package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class substring {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		
		if(str.length() <=10) {
			System.out.println(str);
		}else {
			
			int a = str.length() / 10;
			
			for (int i = 0; i < a; i++) {
				System.out.println(str.substring(10*i , 10*(i+1)));
			}
			
			System.out.println(str.substring(10*a , str.length()));
			
			
		}
	
	}
}
