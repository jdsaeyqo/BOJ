package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class tomato {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int col = Integer.parseInt(st.nextToken());
		int row = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}			
		}
		
		solution s = new solution();
		System.out.println(s.sol(row, col, map));
		
	}
}
class solution {
	
	public int sol(int x, int y, int[][] map) {
		
		Queue<int[]> q = new LinkedList<int[]>();
		
		int answer;
		
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if(map[i][j] == 1) {
					int a = i;
					int b = j;
					q.offer(new int[] {a,b});
				}
			}
			
		}
		
		answer = bfs(q,map);
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if(map[i][j] == 0) {
					return -1;
					
				}
			}
		}		
		
		if(answer== 0) return 0;	

		return answer-1;
	}
	
	public int bfs(Queue<int[]> queue, int[][] map) {
		
		
		if(queue.isEmpty()) return 0;
		
		Queue<int[]> q0 = new LinkedList<>();
		
		int[][] dir = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
		
		int cnt = 0;
		
		while(!queue.isEmpty()) {
			
			int[] q = queue.poll();
			
			int curX = q[0];
			int curY = q[1];
			
			
			
			for (int i = 0; i < dir.length; i++) {
				int newX = curX + dir[i][0];
				int newY = curY + dir[i][1];
				
				if(newX >=0 && newX < map.length && newY >= 0 && newY < map[0].length) {
					if(map[newX][newY] == 0) {
						map[newX][newY] = 1;

						q0.offer(new int[] {newX,newY});
							
					}
				}
			}
						
		}
		cnt++;
		
		cnt+=bfs(q0,map);
		

		return cnt;
	}
}
