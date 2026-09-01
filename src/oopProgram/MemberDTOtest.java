package oopProgram;

public class MemberDTOtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//회원정보를 저장해야함 : 번호, 이름, 연락처, 이메일
//		int num = 100;
//		String name = "이순신";
//		String tel = "010-1234-5678";
//		String email = "sin3311@naver.com";
//		
		MemberDTO dto = new MemberDTO();
		MemberDTO dto2 = new MemberDTO(100, "이순신", "010-1234-5678", "siss372@naver.com");
		MemberDTO dto3 = new MemberDTO(200, "홍길동", "010-3333-1111");
		
		
		//dto 객체의 번호, 이름을 셋팅한다
		dto.setNum(300);
		dto.setName("세종대왕");
		dto.setTel("010-1234-5555");
		
		//getter를 이용하여 연락처를 받아오기
		String phone = dto2.getTel();
		System.out.println(phone);
		
		String result = dto2.toString();
		System.out.println(result);
		String result2 = dto3.toString();
		System.out.println(result2);


	}

}
