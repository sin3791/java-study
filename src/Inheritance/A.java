package Inheritance;

public class A 
extends Object {
	int max = 250;
	public A() {
		System.out.println("A() 생성자메소드");
	}
	public void print() {
		System.out.println("max="+max);
	}
}
