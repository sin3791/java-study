package Inheritance;

public class B extends A {	
	String name = "김삿갓";
	public B() {
		System.out.println("B()생성지 실행됨");
	}
	public String getName() {
		return name;
	}
	public void msg() {
		System.out.println("name="+name);
	}
}