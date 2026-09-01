package oopProgram;

public class MemberDTO {
	private int num;
	private String name;
	private String tel;
	private String email;
	
	//필요한 ?
	public MemberDTO() {}	
	public MemberDTO(int num, String name, String tel, String email) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	public MemberDTO(int num, String name, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
	}
	
	
	@Override
	public String toString() {
		return "num=" + num + ", name=" + name + ", tel=" + tel + ", email=" + email;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
