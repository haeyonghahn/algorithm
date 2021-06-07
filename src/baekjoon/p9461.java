package baekjoon;

import java.util.Scanner;

public class p9461 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		
		for(int i=1; i<=t; i++) {			
			int k = input.nextInt();
			long[] dp = new long[k+5];
			
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 1;
			
			for(int j=4; j<=k; j++) {
				dp[j] = dp[j-3] + dp[j-2];
			}
			System.out.println(dp[k]);
		}
		input.close();
	}

}
