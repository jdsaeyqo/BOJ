package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays; 
import java.util.LinkedList; 
import java.util.Queue;
import java.util.StringTokenizer; 

public class dfs_bfs { 
	
   static int N, M, V; 
   static int[][] map; 
   static boolean[] visit; 
   
   public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken()); 
        M = Integer.parseInt(st.nextToken());  
        V = Integer.parseInt(st.nextToken());  
        
        map = new int[N + 1][N + 1]; 
        visit = new boolean[N + 1]; 
        
        for (int i = 0; i < M; i++) {
        	st = new StringTokenizer(br.readLine());
        	
            int x = Integer.parseInt(st.nextToken());  
            int y = Integer.parseInt(st.nextToken()); 
            
            map[x][y] = 1; 
            map[y][x] = 1; 
        } 
        
        dfs(V);
        
        System.out.println(); 
        Arrays.fill(visit, false); 
        
        bfs(V); 
    }
    
    public static void dfs(int start) { 
    	visit[start] = true; 
        System.out.print(start + " "); 
        for (int i = 1; i < N + 1; i++) { 
            if (map[start][i] == 1 && !visit[i]) dfs(i); 
        } 
    } 
    public static void bfs(int start) { 
        Queue<Integer> q = new LinkedList<>(); 
        q.offer(start); 
        visit[start] = true; 
        
        while (!q.isEmpty()) { 
            int index = q.poll(); 
            System.out.print(index + " "); 
            for (int i = 1; i < N + 1; i++) { 
                if (map[index][i] == 1 && !visit[i]) { 
                    q.offer(i); 
                    visit[i] = true; 
                } 
            } 
        } 
    } 
}



