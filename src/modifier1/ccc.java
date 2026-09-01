package modifier1;
import oopProgram.MemberDTO;
import modifier.aaa;
class ccc {
	ccc(){
		aaa a = new aaa();
//		int b = a.xx;
//		aaa c = new aaa(45);
		
//		a.testMethod();
//		a.yy;
		
//		aaa e = new aaa(3000, "이순신");
//		e.testMethod2();
		
//		int kk = a.zz;
		
		MemberDTO DTO = new MemberDTO();
		MemberDTO DTO2 = new MemberDTO(100, "홍길동", "010-6641-1234", "sadjiaosdj@naver.com");
		
		DTO2.setNum(200);
		System.out.println("DTO2.getNum()==>" + DTO2.getNum());
		
		DTO2.setName("신성욱");
		System.out.println("DTO2.getNum()==>" + DTO2.getName());
	}
}
