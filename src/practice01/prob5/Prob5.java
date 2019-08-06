package practice01.prob5;

public class Prob5 {
	
	public static void compare369(String s) {
		String[] a = new String[3];
		
		//369법칙에 맞게 문자'짝'을 배열에 저장
		for(int j = 0; j < s.length(); ++j) {
			if(s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') {
				a[j] = "짝";					
			}else {
				continue;
			}
		}
		
		//출력
		if(a[0] != null) {
			System.out.print(s + " ");
			for(int z=0; z <s.length(); ++z) {
				if(a[z] != null) {
					System.out.print(a[z]);
				}
			}
			System.out.println();	
		}
		
	}
	
	
	
	public static void main (String args[]) {
		
		for(int i = 1; i<100; ++i) {
			String st = Integer.toString(i);

			compare369(st);
			
		}
		
	}
}
