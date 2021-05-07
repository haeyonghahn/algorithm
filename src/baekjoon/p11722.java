package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class p11722 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] dp = new int[n];
		int[] seq = new int[n];
		for(int i=0; i<n; i++)
			dp[i] = input.nextInt();
		
		Arrays.fill(seq, 1);
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(dp[i] < dp[j]) {
					seq[i] = Math.max(seq[i], seq[j] + 1);
				}
			}
		}
		int max = 0;
		for(int i : seq)
			max = Math.max(max, i);
		System.out.println(max);
		input.close();
	}
}
