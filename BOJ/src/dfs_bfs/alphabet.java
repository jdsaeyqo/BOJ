package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class alphabet {
	
	static int row,col,max = 0;
	static char[][] map;
	static boolean[] visit;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		
		map = new char[row][col];
		visit = new boolean[26];
		
		
		for (int i = 0; i < row; i++) {
			
			String str = br.readLine();
			for (int j = 0; j < col; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		dfs(0,0,1);
		
		System.out.println(max);
	}
	
	private static void dfs(int x, int y,int count) {

		visit[map[x][y] - 'A'] = true;
		
		for (int i = 0; i < 4; i++) {
			
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if(newX >= 0 && newY >= 0 && newX < row && newY < col) {
				if(visit[map[newX][newY] - 'A'] == false) {
					dfs(newX,newY,count+1);
				}
			}
		}
		
		visit[map[x][y] - 'A'] =false;
		max = Math.max(max, count);
		
	}
}
