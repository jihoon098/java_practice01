package practice01.prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main (String args[]) {
		

		for(int i = 1; i < 10; ++i) {
			for(int j = i; j <= i+9; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
	}
}
