package baekjoon;

import java.util.Scanner;

public class p1699 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] dp = new int[n+1];
		
		// 1의 제곱으로만 이루어진 항의 개수
		for(int i=1; i<=n; i++)
			dp[i] = i;
		
		// 2의 제곱으로만 이루어진 것부터는 여기
		for(int i=2; i<=n; i++) {
			for(int j=2; j*j<=i; j++) {
				dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
			}
		}
		System.out.println(dp[n]);
		input.close();
	}

}
