package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sumnum {
	
	static int cnt=0;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];


		st = new StringTokenizer(br.readLine());
		for(int i =0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}


		twoPointer(arr,n,m);

		System.out.println(cnt);

	}

	public static void twoPointer(int[] arr, int n, int m) {


		int start=0,end=0,sum=0;
		
		while(true) {
			
			if(sum >= m) {
				sum-=arr[start];
				start++;
			}
			
			else if(end == n) break;
			
			else {
				sum+=arr[end];
				end++;
			}
			
			if( m == sum) {
				cnt++;
			}
			
		}
		


	}
}
