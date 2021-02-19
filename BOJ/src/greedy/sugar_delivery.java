package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sugar_delivery {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int quot = 0;
		
		
		while(num != 0) {
			
			if(num < 3) {
				cnt = -1;
				break;
			}
			
			if(num % 5 == 0){
				cnt += num/5;
				num%=5;
				
			}
			
			else if(num % 5 == 1) {
				quot = num/5; 
				
				cnt += quot-1;
				num-=5*(quot-1);
				
				cnt += num/3;
				num%=3;
					
			}else if(num % 5 == 2){
				if(num == 7) { 
					cnt = -1;
					break;
				}
				quot = num/5; 
				
				cnt += quot-2;
				num-=5*(quot-2);
				
				cnt += num/3;
				num%=3;
				
				
			} else if(num % 5 == 3){
				cnt += num/5;
				num%=5;
				
				cnt+= num/3;
				num%=3;
			
			
			} else if(num % 5 == 4){
				if(num == 4) { 
					cnt = -1;
					break;
		}
				quot = num/5; 
		
				cnt += quot-1;
				num-=5*(quot-1);
		
				cnt += num/3;
				num%=3;
				
	}
					
		}
		
		System.out.println(cnt);
		
	}
}
