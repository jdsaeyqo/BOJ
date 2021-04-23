package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class maze_ {
	
	static int row;
	static int col;
	static int[][] map;
	static int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
	
	static int bfs(int x, int y) {
		
		Queue<int[]> q = new LinkedList<int[]>();
		
		q.offer(new int[] {x,y});
		
		while(!q.isEmpty()) {
			
			int[] qu = q.poll();
			int cur_x = qu[0];
			int cur_y = qu[1];
			
			for (int i = 0; i < dir.length; i++) {
				int new_x = cur_x + dir[i][0];
				int new_y = cur_y + dir[i][1];
				
				if(new_x < 0 || new_x >= row || new_y < 0 || new_y >=col || map[new_x][new_y] == 0)
					continue;
				
				if(map[new_x][new_y] == 1) {
					
					map[new_x][new_y] = map[cur_x][cur_y] +1;
					q.offer(new int[]{new_x, new_y});
				}
						
				
	
			}
		}
		
		return map[row-1][col-1];
	}
	
	
	
	
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	row = Integer.parseInt(st.nextToken());
	col = Integer.parseInt(st.nextToken());
	
	map = new int[row][col];
	
	for (int i = 0; i < row; i++) {
		String s = br.readLine();
		for (int j = 0; j < col; j++) {
			map[i][j] = s.charAt(j) - '0'; 
			
		}
	}
	System.out.println(bfs(0,0));
	
}



}
