package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class employee{
	
	int score1;			
	int score2;
	
	public employee() {
		
	}
	
	public employee(int x, int y) {
		
		score1 = x;
		score2 = y;
	}

	public int getScore1() {
		return score1;
	}

	public int getScore2() {
		return score2;
	}
		
}

public class new_employee {
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<employee> list = new ArrayList<employee>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int testNum = Integer.parseInt(st.nextToken());
		
		
		for (int i = 0; i < testNum; i++) {
			
		int cnt = 0;
		
		st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		
		
		for (int i1 = 0; i1 < num; i1++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list.add(new employee(x,y));
			
		}
		
		Collections.sort(list, new Comparator<employee>() {

			@Override
			public int compare(employee o1, employee o2) {
				
				return o1.score1 - o2.score1;
			}
		});
		
		int win = list.get(0).score2;
		
		
		
		for (int j = 1; j < list.size(); j++) {
			
			 int cur = list.get(j).score2;
			 
			 if( win < cur) cnt++;
			 
			 if( win > cur) win = cur;
				
			}
			
		
		
		System.out.println(num-cnt);
		list.clear();
		
		}
		
	}

}
