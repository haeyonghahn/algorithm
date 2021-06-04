package baekjoon;

import java.util.Scanner;

public class p2133 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] dp = new int[n+2];
		
		dp[0] = 1;
		dp[2] = 3;
		
		for(int i=4; i<=n; i+=2) {
			dp[i] = dp[i-2]*3;
			for(int j=4; j<=i; j+=2) {
				if(i-j<0)
					break;
				dp[i] = dp[i] + dp[i-j]*2;
			}
		}
		System.out.println(dp[n]);
		input.close();
	}

}
