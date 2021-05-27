package baekjoon;

import java.util.Scanner;

public class p1699 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] dp = new int[n+1];
		
		// 1�� �������θ� �̷���� ���� ����
		for(int i=1; i<=n; i++)
			dp[i] = i;
		
		// 2�� �������θ� �̷���� �ͺ��ʹ� ����
		for(int i=2; i<=n; i++) {
			for(int j=2; j*j<=i; j++) {
				dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
			}
		}
		System.out.println(dp[n]);
		input.close();
	}

}
