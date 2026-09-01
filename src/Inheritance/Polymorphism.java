package Inheritance;

public class Polymorphism {

	public static void main(String[] args) {
		//상속관계에서의 형변환
		//하위클래스 객체를 생성하여 상위클래스 타입의 래퍼런스 변수에 대입하면 자동형변환이 된
		//자동 생성함
		C v1 = new C();
		
		//자동 형변환
		B v2 = new C();
		
		System.out.println("v1.age = " + v1.age);
//		C클래스의 멤버변수는 상위 클래스 타입의 변수에서 사용불가하다
//		System.out.println("v2.age = " + v2.age);
		
//		v2.setAge(45);
		v2.msg();
		System.out.println("------------------");
		
		B v4 = new C();
		
		C v5 = (C)v4;
//		C v3 = (C)new B();
		
	}

}

