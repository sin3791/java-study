package api;

public class StringBufferTest {
	
	public StringBufferTest() {
		// 데이터의 수량이 없을때 사용을 권장
		//String
		//StringBuffer : thread환경 지원
		//StringBuilder : thread환경 지원x
		
		String txt = "";
		StringBuffer txt2 = new StringBuffer();
		StringBuilder txt3 = new StringBuilder("홍길동");
		txt3.append(1234);
		
		
		txt3.insert(3, "[세로추가만 문자열이다.]");
		
		char[] str = {65,66,67,68,69};
		char a = 66;
		
		txt3.insert(3, str);
		
		txt3.replace(2, 8, "StringBuffer");
		
		System.out.println("capacity=" + txt3);
		System.out.println("capacity=" + txt2.capacity());
		System.out.println("capacity=" + txt3.capacity());

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringBufferTest();
	}

}
