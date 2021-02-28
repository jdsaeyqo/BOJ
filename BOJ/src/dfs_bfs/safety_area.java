package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class safety_area {

	static int N;
	static int max;
	static int[][] map;
	static int[][] copy;
	static boolean[][] visit;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		
		map = new int[N][N];
		visit = new boolean[N][N];
				
		max = 0;
		int cnt = 0;
		
		int num = 0;
		for (int i = 0; i < N; i++) {
			st =  new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] > num) num = map[i][j];
			}
		}
		
		for (int i = 0; i <= num; i++) {
			mapCopy();
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if(copy[j][k] > i && visit[j][k] == false) {
						
						dfs(j,k,i);
						cnt++;
						
					}
					
				}
			}
			
			if(cnt > max) max = cnt;
			cnt = 0;
			visit = new boolean[N][N];
		}		
		
		System.out.println(max);
	}

	private static void dfs(int x, int y, int height) {

		visit[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if(newX >=0 && newX < N && newY >=0 &&newY < N) {
				if(copy[newX][newY] > height && visit[newX][newY]== false) {
					dfs(newX,newY,height);
				}
			}
		}
		
		
	}

	private static void mapCopy() {
		copy = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				copy[i][j] = map[i][j];
			}
			
		}
		
	}
}
