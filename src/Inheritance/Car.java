package Inheritance;

//public final class Car extends Object {

public class Car extends Object {
	
	int speed = 0;
	String color = "white";
	int maxSpeed = 200;
	final String brand = "소나타";

	public Car() {
		System.out.println("Car()클래스: speed= " +speed + ",color=" +color);
		
	}
	public Car(String color) {
		this.color = color;
		System.out.println("Car(String color)생성자 실행함");
	}
	
	public final void setColor(String color) {
		this.color = color;
		System.out.println("color=====>" + this.color);
	}
	//메소드
	// excel??
	public void speedUp() {
		speed += 2;
		if(speed >= maxSpeed) {
			speed = maxSpeed;
		}
	}
	// break
	public void speedDown() {
		speed -=2;
		if (speed <= 0) {
			speed = 0;
		}
	}
	
}


