package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class triangle {
	
	static ArrayList<int[]> result = new ArrayList<int[]>();
		
	 public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int num = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < num; i++) {
			
			int[] arr = new int[i+1];
			st= new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			result.add(arr);
	
		}
		
		if(num == 1) System.out.println(result.get(0)[0]);
		
		
		else {
			for (int i = 1; i < result.size(); i++) {
				
				result.get(i)[0] += result.get(i-1)[0];
				result.get(i)[result.get(i).length-1] += result.get(i-1)[result.get(i-1).length-1];
			}
			
			
			for (int i = 2; i < result.size(); i++) {
				for (int j = 1; j < result.get(i).length-1; j++) {
					result.get(i)[j]+=Math.max(result.get(i-1)[j-1], result.get(i-1)[j]);
				}
			}
			int n = result.get(result.size()-1).length;
			int[] answer = new int[n];
			
			for (int i = 0; i < n; i++) {
				answer[i] = result.get(result.size()-1)[i];
				
			}
			
			Arrays.sort(answer);
			System.out.println(answer[answer.length-1]);
		}
	
	}
}
