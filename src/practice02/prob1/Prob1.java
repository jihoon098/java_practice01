package practice02.prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main (String args[]) {
		
		int view_money;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요: ");
		int number = sc.nextInt();
		
		
		int nanugi = 5;
		int switch1 = 1;
		
		for(int a= 50000; a>=1; a = a/nanugi) {
			
			if(number/a >= 1) {
				view_money = number/a;
				System.out.println(a + "원: " + view_money + "개");
				number = number%a;
			}else {
				System.out.println(a + "원: " + 0 + "개");
			}
			
			
			if(switch1 == 1) {
				switch1 = 2;
				nanugi = 5; 
			}else {
				switch1 = 1;
				nanugi = 2;
			}
			
		}
		
		
		sc.close();
	}
}
