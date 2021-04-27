package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class sum {
	public int sol(int[] arr) {
		int max = -1001;
		int sum = 0;
		
		for(int i =0; i < arr.length; i++) {
			sum+=arr[i];
			if(sum > max) {
				max = sum;
			}
		
			if(sum <0) {
				sum = 0;
			}
		}
		
		
		
		return max ;
	}
}

public class serialSum {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st  = new StringTokenizer(br.readLine());
		for(int i = 0; i < arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		sum s = new sum();
		
		int a= s.sol(arr);
		System.out.println(a);
		
	}
}
