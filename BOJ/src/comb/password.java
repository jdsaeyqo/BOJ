package comb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class pass{
	boolean[] visit;
	ArrayList<String> answer = new ArrayList<String>();
	ArrayList<String> result = new ArrayList<String>();

	public void sol(int n, int r, char[] arr){


		visit = new boolean[arr.length];

		comb(arr,0,n,r);

		for(int i = 0; i < result.size();i++) {
			String str = result.get(i);

			if(check(str)) {
				System.out.println(str);
			}
		}


		
	}


	private boolean check(String str) {
		
		int j = 0;
		int m = 0;
		
		for(int i = 0; i < str.length();i++) {
			char c = str.charAt(i);
			if(c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'e') {
				m++;
			}
			else {
				j++;
			}
			
		}
		
		if (j >=2 && m >=1) return true;
		
		return false;
	}


	private void comb(char[] arr, int start, int n, int r) {

		if(r == 0) {
			
			String s = "";
			for(int i =0; i < visit.length;i++) {
				if(visit[i]) {
					s+=arr[i];
				}
			}
			result.add(s);
			return;
		}

		for (int i = start; i < n; i++) {
			if(visit[i] == false) {
				visit[i] = true;
				comb(arr,i+1,n,r-1);
				visit[i] = false;
			}

		}

	}
}

public class password {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int r = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		char[] arr = new char[n];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr.length; i++) {
			arr[i] = st.nextToken().charAt(0);
		}

		pass p = new pass();
		Arrays.sort(arr);
		p.sol(n, r, arr);



	}
}
