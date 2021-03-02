package bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class oneNum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		if (num < 100) System.out.println(num);
		
		
		else{
			if(num == 1000) num = 999;
			for (int i = 100; i <= num; i++) {
			
			String s = String.valueOf(i);
			char[] arr = s.toCharArray();
			
			if(arr[2]-arr[1] == arr[1]-arr[0]) cnt++;
			
		}
			System.out.println(cnt+99);
	}
	}
}

