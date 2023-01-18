package Abstraction;

class Car2{
	//필드 정의: 객체의 속성을 나타낸다
	String color;
	int speed;
	int gear;
	//메소드 정의: 객체의 동작을 나타낸다
	void print() {	
		System.out.println("{" + color + ", " + speed + ", " + gear + ")");
	}
}
public class CarTest2 {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();
		
		Car yourCar = new Car();
		yourCar.color = "blue";
		yourCar.speed = 60;
		yourCar.gear = 3;
		yourCar.print();
	}

}
