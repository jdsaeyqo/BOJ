package bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



class person{
	int height;
	int weight;
	int order;
	public person(int h , int w) {
		height = h;
		weight = w;
		order = 1;
	}
	
	
}

public class height_weight {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		person[] person = new person[n];
		
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			person p =new person(h,w);
			person[i] = p;
			
		}
		
		for (int i = 0; i < person.length; i++) {
			for (int j = 0; j < person.length; j++) {
				if(i!=j) {
					
					if(person[i].height < person[j].height && 
					   person[i].weight < person[j].weight) {
						
					person[i].order++;
				}
				}
			}
		}
		
		for (int i = 0; i < person.length; i++) {
			System.out.print(person[i].order+" ");
		}
	}
}





















