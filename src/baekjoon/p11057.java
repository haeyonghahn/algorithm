package baekjoon;

import java.util.Scanner;

public class p11057 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] dp = new int[10000][10];
		int n = input.nextInt();
		int sum = 0;
		
		for(int i=0; i<=9; i++) {
			dp[1][i] = 1;
		}
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				if(j == 0) {
					dp[i][j] = dp[i-1][j];
				}
				else {					
					dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % 10007; 
				}
			}
		}
		for(int i=0; i<=9; i++) {
			sum = (sum + dp[n][i]) % 10007;
		}
		System.out.println(sum);
		input.close();
	}
}
