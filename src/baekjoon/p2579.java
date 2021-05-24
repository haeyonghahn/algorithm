package baekjoon;

import java.util.Scanner;

public class p2579 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] stair = new int[n];
		int[] dp = new int[n];
		
		for(int i=0; i<stair.length; i++)
			stair[i] = input.nextInt();
		dp[0] = stair[0];
		dp[1] = Math.max(stair[1], stair[0] + stair[1]);
		dp[2] = Math.max(stair[0] + stair[2], stair[1] + stair[2]);
		
		for(int i=3; i<n; i++) {
			dp[i] = Math.max(stair[i] + dp[i - 2], stair[i] + stair[i - 1] + dp[i - 3]);
		}
		System.out.println(dp[n - 1]);
		input.close();
	}

}
