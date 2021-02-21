package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2775 {
	
	static int[] zero_floor = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	
	static int sum;
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int testnum = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < testnum; i++) {
			st = new StringTokenizer(br.readLine());
			int floorNum = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int roomNum = Integer.parseInt(st.nextToken());
			
			
			System.out.println(people(floorNum,roomNum));
			
			
		}
		
		
		
}
	private static int people(int floorNum, int roomNum) {
			
			if(floorNum == 0) {
				
				sum = zero_floor[roomNum];
				
				
				return sum;
			}
			
			sum = 0;
				
			for (int i = 1; i <= roomNum; i++) {
				sum+=people(floorNum-1,i);
			}
			
		
		
		return sum;
	}
}

