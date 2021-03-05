package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class home_number {
	
	static int row,col;
	static int[][] map;
	static boolean[][] visit;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};

	
	static int dfs(int x, int y) {
		
		int num = 1;
		
		visit[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if(newX >= 0 && newX < row && newY >= 0 && newY < col) {
				if(map[newX][newY] == 1 && visit[newX][newY] == false) {
					num+=dfs(newX,newY);
				}
			}
		}
				
		return num;
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		row = size; 
		col = size;
		map = new int[row][col];
		visit = new boolean[row][col];
		
		for (int i = 0; i < row; i++) {
			String s = br.readLine();
			for (int j = 0; j < col; j++) {
				map[i][j] = s.charAt(j) - '0';
			}

		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		int cnt = 0;
		int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
			if(map[i][j] == 1 && visit[i][j] == false) {
				sum = dfs(i, j);
				arr.add(sum);
				sum = 0;
				cnt++;
			}
		}
		
	}
	System.out.println(cnt);

	Collections.sort(arr);
	
	for (int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i));
	}
	
}

}
