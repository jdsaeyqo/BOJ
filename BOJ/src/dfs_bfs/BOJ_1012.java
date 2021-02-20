package dfs_bfs;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1012 {
	
	static int row,col;
	static int[][] map;
	static boolean[][] visit;
	static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
	
	
		
	static boolean dfs(int x, int y){
		if(x < 0 || x >= row || y < 0 || y >= col) return false;
		
		if(map[x][y] == 0) return false;

		if(visit[x][y] == false) {
			visit[x][y] = true;
			dfs(x+1,y);
			dfs(x,y+1);
			dfs(x-1,y);
			dfs(x,y-1);
			return true;
		}
		return false;
}	
	
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int testcase_num = Integer.parseInt(st.nextToken());
	
	for (int i = 0; i < testcase_num; i++) {
		
		st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		map = new int[row][col];
		visit = new boolean[row][col];
		
		
		for (int j = 0; j < num; j++) {
			st = new StringTokenizer(br.readLine());
			int x =  Integer.parseInt(st.nextToken());
			int y =  Integer.parseInt(st.nextToken());
			
			map[x][y] = 1;
		}
		
		int cnt = 0;
		for (int k = 0; k < row; k++) {
			for (int k2 = 0; k2 < col; k2++) {
	
				if(dfs(k,k2))cnt++;
			}
			}
			
		
		
		System.out.println(cnt);
	
	}
}
}

