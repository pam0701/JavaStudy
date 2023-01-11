package floating_point;

//원의 면적 구하기 
//double은 실수형을 나타내므로 3.141592는 부동소수점형 자료형인 실수형을 사용하여야 한다
public class AreaTest {
	public static void main(String[] args) {
		double radius, area;
		final double PI = 3.141592;
		
		radius = 5;
		area = PI * radius * radius;
		System.out.println("원의 면적은 " + area);

	}
}
