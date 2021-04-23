package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class floyd {
	static int N,M;
	static int[][] map;
	static int INF = 987654321;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());

		map = new int[N+1][N+1];

		for(int i =1; i < N+1; i++) {
			for(int j = 1; j < N+1;j++) {
				map[i][j] = INF;

				if(i == j) {
					map[i][j] = 0;
				}
			}
		}



		for(int i =0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken());

			map[a][b] = Math.min(map[a][b], c);

		}

		floyd_();

		for(int i = 1; i < N+1;i++) {
			for(int j = 1; j < N+1;j++) {
				if(map[i][j] == INF) {
					map[i][j] = 0;
				}
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}


	}
	private static void floyd_() {

		for(int k = 1; k < N+1;k++) {
			for(int i = 1; i < N+1;i++) {
				for(int j = 1; j< N+1;j++) {
					if(map[i][j] > map[i][k] + map[k][j]) {
						map[i][j] = map[i][k] + map[k][j];
					}
				}
			}
		}


	}

}
