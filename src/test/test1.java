package test;

public class test1 {
	int a, b;
	public void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public void avg(int a, int b) {
		System.out.println((a+b)/2);
	}
	
	public void divide(int a, int b) {
		System.out.println(a/b);
	}
	
	public void minus(int a, int b) {
		System.out.println(a-b);
	}
	
	public void a1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void sum() {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		test1 c1 = new test1();
		c1.sum(100, 200);
		c1.avg(200,300);
		c1.divide(100,2);
		c1.minus(11, 20);
		
		test1 c2 = new test1();
		c2.a1(30, 50);
		c2.sum();
	}
}
