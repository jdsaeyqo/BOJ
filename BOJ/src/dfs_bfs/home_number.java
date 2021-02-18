package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class home_number {
	
	static int row,col;
	static int[][] map;
	static boolean[][] visit_cnt;
	static boolean[][] visit_num;
	
	
	static boolean dfs_cnt(int x, int y) {
		
		if(x < 0 || x >= row || y < 0 || y >= col) return false;
				
		if(map[x][y] == 1 && visit_cnt[x][y] == false) {
			visit_cnt[x][y] = true;
			dfs_cnt(x-1,y);
			dfs_cnt(x+1,y);
			dfs_cnt(x,y-1);
			dfs_cnt(x,y+1);
			return true;
		}
		
		return false;
	}
	
	static int dfs_num(int x, int y) {
		
		if(x < 0 || x >= row || y < 0 || y >= col) return 0;
		
		int num = 1;
		
		if(map[x][y] == 1 && visit_num[x][y] == false) {
			visit_num[x][y] = true;
			num+=dfs_num(x-1,y);
			num+=dfs_num(x+1,y);
			num+=dfs_num(x,y-1);
			num+=dfs_num(x,y+1);
			return num;
		}
		
		return 0;
	}
	
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		row = size; 
		col = size;
		map = new int[row][col];
		visit_cnt = new boolean[row][col];
		visit_num = new boolean[row][col];
		
		for (int i = 0; i < row; i++) {
			String s = br.readLine();
			for (int j = 0; j < col; j++) {
				map[i][j] = s.charAt(j) - '0';
			}

		}
		
		int cnt = 0;
	
		for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			if(dfs_cnt(i,j)) cnt++;
		}
		
	}
	System.out.println(cnt);
	
	ArrayList<Integer> arr = new ArrayList<>();
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			int ans = dfs_num(i,j);
			if(ans!=0) {
				arr.add(ans);
			}
		}
		
	}

	Collections.sort(arr);
	
	for (int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i));
	}
	
//	int[] arr = new int[cnt];
//	
//	int num = 0;
//	for (int i = 0; i < row; i++) {
//		for (int j = 0; j < col; j++) {
//			int ans = dfs_num(i,j);
//			if(ans != 0 ) {
//				arr[num] = ans;
//				num++;
//			}
//		}
//		
//	}

//	Arrays.sort(arr);
//	for (int i = 0; i < arr.length; i++) {
//		System.out.println(arr[i]);
//	}
	
	
}

}
