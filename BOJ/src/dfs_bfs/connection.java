package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class connection {
	
public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int size = Integer.parseInt(st.nextToken());
	int num = Integer.parseInt(st.nextToken());
	
	int[][] map = new int[size+1][size+1];
	boolean[] visit = new boolean[size+1];
	
	for (int i = 0; i < num; i++) {
		st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		map[row][col] = 1;
		map[col][row] = 1;
	}

	
	int cnt = 0;
	for (int i = 1; i < size+1; i++) {
		if(!visit[i]) {
			dfs(i,map,visit);
			cnt++;
		}
	}
		
	System.out.println(cnt);
	}

private static boolean[] dfs(int i, int[][] map, boolean[] visit) {

	visit[i] = true;

	for (int j = 1; j < map.length; j++) {
		if( i != j && map[i][j] == 1 && visit[j] == false) {
			visit = dfs(j,map,visit);
			
		}
	}
	
	
	
	return visit;
}
}
