package while_loop;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		int x, y, r;
		System.out.println("두 정수를 입력해주세요: ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		
		//y가 0이 아니면 반복을 계속한다
		while(y!=0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("두 정수의 최대 공약수는" + x);
	}

}
