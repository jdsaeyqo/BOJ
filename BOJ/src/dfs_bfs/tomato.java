package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class solution {
	public int sol(int x, int y, int[][] map) {
		
		Stack<int[]> stk = new Stack<int[]>();
		
		int answer;
		
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if(map[i][j] == 1) {
					int a = i;
					int b = j;
					stk.push(new int[] {a,b});
				}
			}
			
		}
		
		answer = dfs(stk,map);
		
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
	
	public int dfs(Stack<int[]> stk, int[][] map) {
		
//		boolean[][] visit = new boolean[map.length][map[0].length];
		
		if(stk.isEmpty()) return 0;
		
		Stack<int[]> newstk = new Stack<>();
		
		int[][] dir = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
		
		int cnt = 0;
		
		while(!stk.isEmpty()) {
			
			int curX = stk.peek()[0];
			int curY = stk.peek()[1];
			stk.pop();
			
			
			for (int i = 0; i < dir.length; i++) {
				int newX = curX + dir[i][0];
				int newY = curY + dir[i][1];
				
				if(newX >=0 && newX < map.length && newY >= 0 && newY < map[0].length) {
					if(map[newX][newY] == 0) {
						map[newX][newY] = 1;

						newstk.push(new int[] {newX,newY});
							
					}
				}
			}
						
		}
		cnt++;
		
		cnt+=dfs(newstk,map);
		

		return cnt;
	}
}

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
