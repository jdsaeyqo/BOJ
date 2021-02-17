package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class virus {
	public static int[][] map;
	public static boolean[] visit;
	public static int n,com;
	public static int cnt;
	

	public static int dfs(int i) {
	
	if( i > com ) return 0;
	
	cnt = 0;
	
	visit[i] = true;
	
	for (int j = 1; j <= com; j++) {
		if(map[i][j] == 1 && visit[j] == false) {
			cnt++;
			cnt+=dfs(j);
			
		}
	}
	
	
	return cnt;
}

	
	
public static void main(String[] args) throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	com = Integer.parseInt(st.nextToken());
	
	map = new int [com+1][com+1];
	visit = new boolean [com+1];
	
	st = new StringTokenizer(br.readLine());
	
	 n = Integer.parseInt(st.nextToken());
	
	for (int i = 0; i < n; i++) {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		map[a][b] = 1;
		map[b][a] = 1;
	}
	
	
	System.out.println(dfs(1));
	
	
}
}
