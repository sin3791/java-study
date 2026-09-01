package modifier;
// 클래스, field , 생성자 메소드, 메
public class aaa {
	//생성자 메소드
	int xx= 200;
	private int zz =1234;
	protected int yy = 1111;
	public aaa(){
		System.out.println("zz= "+ zz);
	}
	aaa(int a){
		
	}
	void testMethod() {
		int no = 456;
		System.out.println("no=" + no);
		System.out.println("zz= "+ zz);
		zz += 5000;
	}
	
	protected aaa(int a, String b) {
		xx= a;
	}
	protected void testMethod2() {
		System.out.println("xx = " + xx);
		System.out.println("yy = " + yy);
		testMethod3();
	}
	private aaa(int a, int b) {
		
	}
	//상속불가 메소드, 오버라이딩불가
	private void testMethod3() {
		System.out.println("zz = " + zz);

	}
}
