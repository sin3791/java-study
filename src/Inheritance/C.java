package Inheritance;

public class C extends B {
	int age = 35;
	public C() {
		System.out.println("C()생성자 메소드 실행됨");
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void msg() {
		System.out.println("age="+age);
	}
}
