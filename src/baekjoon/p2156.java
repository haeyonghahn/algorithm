package baekjoon;

import java.util.Scanner;

public class p2156 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] wine = new int[n+1];
		int[] dp = new int[n+1];
		
		for(int i = 1; i < n+1; i++)
			wine[i] = scan.nextInt();
		
		dp[1] = wine[1]; 
		if(n >= 2)
			dp[2] = dp[1] + wine[2];
		if(n >= 3) {
			for(int i = 3; i < n+1; i++)
				dp[i] = Math.max(Math.max(wine[i] + wine[i-1] + dp[i-3], wine[i] + dp[i-2]), dp[i-1]);
		}
		System.out.println(dp[n]);
	}
	
}
