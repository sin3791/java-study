//package Inheritance;
//import modifier.aaa;
//public class ProtectedTest extends aaa {
//
//	int zz = 5678;
//	public ProtectedTest() {
//		//super() 생략
//		aaa a = new aaa();
//		//protectedTest접근하기
////		System.out.println("a.yy==>"+ a.yy);
////		System.out.println("a.xx==>"+ a.xx);
//		
////		a.testMethod2();
//		
//		System.out.println("aaa.yy==>" + yy);
//		testMethod2();
//		
//		// -----------private -----------
//		
////		System.out.println("a.zz==" +a.zz);
////		System.out.println("aaa.zz" + zz);
//	}
//	@Override
//	// 상위 클래스의 Private메소드는 하위클래스에서 Override할 수 없다.
//	public void testMethod3() {
//		//상위클래스의 private메소드를 호출할 수 없다.
//		super.testMethod3();
//		System.out.println("하위클래스의 오버라이딩");
//	}
//	
//	public static void main(String[] args) {	
//		new ProtectedTest();
//	}
//
//}
