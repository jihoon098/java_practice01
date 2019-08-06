package practice02.prob3;

import java.util.Scanner;


public class Prob3 {
	
	
	public static void main (String args[]) {
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a',' ', 'p', 'e', 'n', 'c', 'i', 'l', '.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
	
	
	public static void replaceSpace(char a[]) {
		for(int i = 0; i<16; ++i) {
			if(a[i] == ' ') {
				a[i] = ',';
			}
		}
	}
	
	
	public static void printCharArray(char a[]) {
		for(int i = 0; i< 16; ++i ) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	


}
