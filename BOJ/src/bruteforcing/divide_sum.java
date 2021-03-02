package bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class divide_sum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		int sum=0;
		
		String num_str = "1";
		
		while(sum != input) {
			
			if(Integer.parseInt(num_str) >= input) {
				break;
			}
			
		sum = 0;
		
		 for (int i = 0; i < num_str.length(); i++) {
			sum += num_str.charAt(i) - '0';
		}
		
		sum+=Integer.parseInt(num_str);
		
		
		int num_int = Integer.parseInt(num_str);
		num_int++;
		num_str = String.valueOf(num_int);
		
		
			
		}
		
		if(Integer.parseInt(num_str) >= input) {
			System.out.println(0);
		}
		else {
			System.out.println(Integer.parseInt(num_str)-1);
		}
		
	}
}
