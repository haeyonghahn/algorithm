package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p9465 {

	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int t = Integer.parseInt(bufferedReader.readLine());

			for(int i = 0; i < t; i++) {
				int n = Integer.parseInt(bufferedReader.readLine());
				int[][] stickers = new int[2][n];
				int[][] dp = new int[2][n];

				String[] input = bufferedReader.readLine().split(" ");
				for(int j = 0; j < n; j++)
					stickers[0][j] = Integer.parseInt(input[j]);

				input = bufferedReader.readLine().split(" ");
				for(int j = 0; j < n; j++)
					stickers[1][j] = Integer.parseInt(input[j]);

				for(int j = 0; j < n; j++) {
					if(j == 0) {
						dp[0][j] = stickers[0][j];
						dp[1][j] = stickers[1][j];
					}
					else if(j == 1) {
						dp[0][j] = stickers[0][j] + dp[1][j - 1];
						dp[1][j] = stickers[1][j] + dp[0][j - 1];
					}
					else {
						dp[0][j] = Math.max(Math.max(stickers[0][j] + dp[0][j - 2], stickers[0][j] + dp[1][j - 2]), stickers[0][j] + dp[1][j - 1]);
						dp[1][j] = Math.max(Math.max(stickers[1][j] + dp[1][j - 2], stickers[1][j] + dp[0][j - 2]), stickers[1][j] + dp[0][j - 1]);
					}
				}
				System.out.println(Math.max(dp[0][n - 1], dp[1][n - 1]));
			}
		} catch(Exception e) {
			throw e;
		} finally {			
			bufferedReader.close();
		}
	}
	
}
