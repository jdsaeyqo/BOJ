package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class route_find {
	
	static int N;
	static int[][] map;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		N = Integer.parseInt(st.nextToken());
		map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
			
		}
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				
				if(map[i][j] == 1) {
					dfs(i,j);
				}
			}
			
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

	private static void dfs(int a, int b) {
		
		for (int i = 0; i < N; i++) {
			if(map[b][i] == 1 && map[a][i] !=1) {
				map[a][i] = 1;
				dfs(a,i);
			}
		}
		
		
		
	}
}
