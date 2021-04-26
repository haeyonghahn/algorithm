package baekjoon;

import java.util.Scanner;

public class p1463 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int[] array = new int[X + 1];
		array[0] = 0;
		array[1] = 0;
		
		// Bottom up 规侥 : 皋葛府力捞记
		for(int i=2; i<=X; i++) {
			array[i] = array[i-1] + 1;
			if(i % 2 == 0)
				array[i] = Math.min(array[i], array[i/2] + 1);
			if(i % 3 == 0)
				array[i] = Math.min(array[i], array[i/3] + 1);
		}
		System.out.println(array[X]);
		input.close();
	}
	
}
