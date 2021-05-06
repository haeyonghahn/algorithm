package baekjoon;

import java.util.Scanner;

public class p11055 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] dp = new int[n];
		int [] seq = new int[n];
		int max = 0;
		
		for(int i=0; i<n; i++) {
			dp[i] = input.nextInt();
		}
		seq[0] = dp[0];
		for(int i=1; i<n; i++) {
			seq[i] = dp[i];
			for(int j=0; j<i; j++) {
				if(dp[i] > dp[j]) {
					seq[i] = Math.max(seq[i], seq[j] + dp[i]);
				}
			}
		}
		for(int i : seq) {
			max = Math.max(i, max);
		}
		System.out.println(max);
		input.close();
	}

}