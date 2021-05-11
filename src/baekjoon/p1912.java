package baekjoon;

import java.util.Scanner;

public class p1912 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] dp = new int[n];
		int[] seq = new int[n];
		
		for(int i=0; i<n; i++)
			dp[i] = input.nextInt();
		seq[0] = dp[0];
		for(int i=1; i<n; i++)
			seq[i] = Math.max(seq[i - 1] + dp[i], dp[i]);
		int max = dp[0];
		for(int i=0; i<n; i++)
			max = Math.max(max, seq[i]);
		System.out.println(max);
		input.close();
	}

}
