package baekjoon;

import java.util.Scanner;

public class p10991 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int i=1; i<=N; i++) {
			// 첫줄
			if(i == 1) {				
				for(int j=1; j<=N-1; j++)
					System.out.print(" ");
				System.out.println("*");
			}
			// 중간줄 및 마지막줄
			else {
				// 앞 공백 
				for(int j=N-i; j>0; j--)					
					System.out.print(" ");
				// 가운데 공백
				for(int j=1; j<=2*i-1; j++) {
					if(j % 2 == 0)
						System.out.print(" ");
					else 
						System.out.print("*");
				}
				System.out.println();
			}
		}
		input.close();
	}
	
}
