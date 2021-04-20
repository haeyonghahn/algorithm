package baekjoon;

import java.util.Scanner;

public class p11726 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n + 1];
		array[0] = 1;
		array[1] = 1;
		
		for(int i=2; i<=n; i++) {
			array[i] = (array[i-2] + array[i-1]) % 10007;
		}
		System.out.println(array[n]);
		input.close();
	}
}
