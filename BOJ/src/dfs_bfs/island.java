package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class island {
	
	static int[][] map;
	static int row;
	static int col;
	static int sum;
	static int[] dx = {1,0,-1,0,1,1,-1,-1};
	static int[] dy = {0,1,0,-1,1,-1,1,-1};
	
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			col = Integer.parseInt(st.nextToken());
			row = Integer.parseInt(st.nextToken());
			int cnt = 0;
			if( col == 0 && row == 0) break;
			
			map = new int[row][col];
			
			
			for (int i = 0; i < row; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < col; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if(map[i][j] == 1) {
					dfs(i,j);
					cnt++;
					}
					
				}
			}
			
			
			System.out.println(cnt);
						
			
		}
	}

	private static void dfs(int x, int y) {
		
		map[x][y] = 0;
		
		
		for (int i = 0; i < 8; i++) {
			
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if(newX >=0 && newX < row && newY >=0 && newY < col) {
				if(map[newX][newY] == 1) {
					dfs(newX,newY);
				}
			}
			
		}
		
		
	}
	
}
