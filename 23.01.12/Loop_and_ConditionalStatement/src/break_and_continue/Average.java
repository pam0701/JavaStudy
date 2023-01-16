package break_and_continue;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("점수를 입력하세요: ");
			int grade = scan.nextInt();
			if(grade < 0)
				break;
			
			total += grade;
			count++;
		}
		System.out.println("평균은" + total / count);

	}

}
