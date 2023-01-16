package for_loop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		System.out.println("정수를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i =1; i<=n; i++) {
			fact = fact * i;
		}
		// for 반복문은 반복할 코드가 한 줄이라면 다음과 같이 중괄호는 생략가능!
		System.out.printf("%d!은 %d입니다\n", n, fact);
	}

}
