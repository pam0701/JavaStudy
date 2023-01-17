//문자열을 대상으로 반복하며 문자 'n'이 나타나는 횟수를 카운팅한다
//만약 현재의 문자가 n이 아니면 continue 문에 의하여 루프의 나머지 부분을 생략하고 다음 문자를 처리한다 
//만약 문자가 n이면 카운트를 증가한다
package break_and_continue;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		String a = "I have no time to see news";
		int count = 0;
		
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i) == 'n') {
				count++;
			}
		}
		System.out.println("n의 갯수는" + count);

	}

}
