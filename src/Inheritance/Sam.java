package Inheritance;

class Test {
	public int a =3;
	public void print() {
		a+=5;
		System.out.print("f");
	}
	
}

class Ex extends Test{
	public int a = 8;
	public void print() {
		this.a+=5;
		System.out.print("b");
	}
}


public class Sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ob = new Ex();
		ob.print();
		System.out.print(ob.a);
	}

}
