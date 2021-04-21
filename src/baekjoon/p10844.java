package baekjoon;

import java.util.Scanner;

public class p10844 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[][] dp = new int[101][10];
		int sum = 0;
		
		// 수의 길이가 1인경우		
		for(int i=0; i<=9; i++) {
			dp[1][i] = 1;
		}			
		for(int i=2; i<=N; i++) {
			for (int j = 0; j <= 9; j++) {
				// 끝의 자리 수가 0일 때에는 전에 값의 끝자리가 1인 경우
				if(j == 0) {
					dp[i][0] = dp[i-1][1];
				}
				// 끝의 자리 수가 9일 때에는 전에 값의 끝자리가 8인 경우
				else if(j == 9) {
					dp[i][9] = dp[i-1][8];
				}	
				// 끝의 자리 수가 1~8일 때
				else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;											
				}
			}
		}
		for(int i=1; i<=9; i++) {
			sum = (sum + dp[N][i]) % 1000000000;
		}
		System.out.println(sum);
		input.close();
	}

}
