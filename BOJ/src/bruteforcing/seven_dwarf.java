package bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class seven_dwarf {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			int val = Integer.parseInt(br.readLine());
			arr[i] = val;
			sum+=val;
		}
		
		
		 Loop : for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(sum-(arr[i]+arr[j]) == 100) {
					arr[i] = 0;
					arr[j] = 0;
					break Loop;
				}
				
			}
		}
		
		
		Arrays.sort(arr);
		
		for (int i = 2; i < arr.length; i++) {
			
				System.out.println(arr[i]);
			
		}

	}
}
