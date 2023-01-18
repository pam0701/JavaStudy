//저장할 때 따로 Car.java와 CarTest.java로 나눠서 저장하여도 된다
package Abstraction;


class Car{
	//필드 정의: 객체의 속성을 나타낸다
	String color;
	int speed;
	int gear;
	//메소드 정의: 객체의 동작을 나타낸다
	void print() {	
		System.out.println("{" + color + ", " + speed + ", " + gear + ")");
	}
}
public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();	//Car 객체 생성 myCar는 Car의 인스턴스(객체)의 이름이 된다 
		myCar.color = "red";	//필드에 접근하려면 도트 연산자(.)를 사용한다
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();
	}

}
