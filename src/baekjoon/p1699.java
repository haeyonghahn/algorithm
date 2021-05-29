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
		/*
		 * 예시 : 43-36=7이므로 7을 제곱수의 합으로 나타냈을때 최소의 개수에 1을 더하면 36을 사용하면서 최소 개수로 
		 * 43을 나타낼 때 경우를 알 수 있다. 이는 즉 , d[7]+1 인데 1을 더하는 것은 d[7]방법에 36인 항을 하나 더해 
		 * 43을 나타낸다는 의미이다.
		 * 
		 */
		for(int i=2; i<=n; i++) {
			for(int j=2; j*j<=i; j++) {
				dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
			}
		}
		System.out.println(dp[n]);
		input.close();
	}

}
