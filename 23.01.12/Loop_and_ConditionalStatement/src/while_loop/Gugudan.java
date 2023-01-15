package while_loop;
import java.util.*;

public class Gugudan {

	public static void main(String[] args) {
		int n;
		int i = 1;
		System.out.println("구구단에서 출력하고 싶은 단을 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		while(i<=9) {
			System.out.println(n + "*" + i + "=" + n*i);
			i++;
		}

	}

}
