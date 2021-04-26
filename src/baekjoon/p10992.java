package baekjoon;

import java.util.Scanner;

public class p10992 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i=1; i<=num-1; i++) {
			// 첫줄
			if(i == 1) {				
				for(int j=1; j<=num-1; j++)
					System.out.print(" ");
				System.out.println("*");
			}
			// 중간줄
			else {
				//앞 공백
				for(int j=num-i; j>0; j--) 
					System.out.print(" ");
				System.out.print("*");
				//가운데 공백
				for(int j=1; j<=2*(i-1)-1; j++) 
					System.out.print(" ");
				System.out.println("*");
			}
		}
		// 마지막줄
		for(int i=1; i<=2*num - 1; i++) {
			System.out.print("*");
		}
		input.close();
	}
	
}