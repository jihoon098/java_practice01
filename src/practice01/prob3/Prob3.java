package practice01.prob3;

import java.util.Scanner;


public class Prob3 {
	
	
	public static void main (String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요: ");
		int number = sc.nextInt();
		int sum = 0;
		
		if(number%2 == 0) { // 짝수일 경우 계산
			for(int cal = 2; cal <= number; cal = cal+2) {
				sum += cal;
			}
		}else { //홀수인 경우 계산
			for(int cal = 1; cal <= number; cal = cal+2) {
				sum += cal;
			}
		}
		
		System.out.println("결과 값 : " + sum);
		
		sc.close();
	
	}

}
