package baekjoon;

import java.util.Scanner;

public class p9095 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int[] dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i=1; i<=T; i++) {	
			int n = input.nextInt();
			for(int j=4; j<=n; j++) {
				dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
			}
			System.out.println(dp[n]);
		}
		input.close();
	}
}
