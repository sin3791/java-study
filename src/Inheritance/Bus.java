package Inheritance;

public class Bus extends Car{
	// 상위클래스를 멤버변수와 같은 변수명을 하위클래스에서도 정의 할 수 있다.
	
	String color = "red";
	int capacity = 20;
	int maxSpeed = 100;
	//생성자 메서드
	public Bus() {
		System.out.println("Bus()클래스의 생성자 메소드");
		System.out.println("생성자()에서 color=" + color +", capacity= " + capacity + ", maxSpeed= " + maxSpeed);
		// 상위클래스의 Color변수 접근하기
		System.out.println("color==>" + color);
	}
	
	public Bus(int maxSpeed) {
		super.maxSpeed = maxSpeed;
		System.out.println("최고속도==>" + maxSpeed);
		
		
		
		super.maxSpeed = maxSpeed;
		System.out.println("최고속도");
	}
	
	public void setMaxSpeed(int max) {
		maxSpeed = max;
	}
	
	//메소드 재정의: 상위클래스의 메소드를 하위 클래스에서 재정의한다
	//오버라이딩
	//접근제한자는 상위클래스의 접근제한자보다 넓은 의미의 접근제한자를 표기해야한다
	@Override
	public void speedUp() {
		speed++;
		if (speed >= maxSpeed) {
			speed = maxSpeed;
		}
	}
	
	
	public static void main(String args[]) {
		Bus bus = new Bus();
		System.out.println("bus.color=" + bus.color);
		
		System.out.println("----------------------------");
		Bus bus2 = new Bus(100);
		
	}
	
	
	
	
	
}
