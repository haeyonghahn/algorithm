package baekjoon;

import java.util.Scanner;

public class p2446 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		for(int i=0; i<N; i++) {
			// 첫줄
			if(i == 0) {				
				for(int j=0; j<2*N-1; j++)
					System.out.print("*");
				System.out.println();
			}
			// 중간줄
			else {					
				for(int j=0; j<=i-1; j++)
					System.out.print(" ");
				for(int j=0; j<2*(N-i) - 1; j++)
					System.out.print("*");
				System.out.println();
			}
		}
		for(int i=1; i<=N-1; i++) {
			for(int j=0; j<=(N-i)-2; j++)
				System.out.print(" ");
			for(int j=1; j<=2*i+1; j++)
				System.out.print("*");
			System.out.println();
		}
		input.close();
	}
	
}
