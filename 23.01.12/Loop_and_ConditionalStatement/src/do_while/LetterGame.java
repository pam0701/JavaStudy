// do-while문은 데이터를 처리하기 전에 사용자로부터 메뉴나 데이터를 입력받아야할 때 많이 사용된다
//do-while문은 while문과는 반대로 먼저 반복 문장을 실행하고 조건을 나중에 검사하는 반복 구조
//숫자 알아맞히기 게임(미리 저장된 수가 있고 사용자가 그 정답을 추측하여 알아맞히는 게임)
package do_while;
import java.util.*;
public class LetterGame {
	public static void main(String[] args) {
		int answer = 59;
		int guess_answer;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("정답을 추측해보세요: ");
			guess_answer = scan.nextInt();
			count++;
			
			if(guess_answer > answer) {
				System.out.println("추측한 숫자가 답보다 큽니다");
			}
			else if(guess_answer < answer){
				System.out.println("추측한 숫자가 답보다 작습니다.");
			}
	}while(answer != guess_answer);
		System.out.println("정답을 맞추셨습니다!\n 정답은" + answer + "입니다" + "정답 시도 횟수는" + count);
	}
}
