package InnerClass;

public class MethodInnerClass {
	int num = 1111;
		String email = "abc@name.com";
	MethodInnerClass(){
		System.out.println("num=" + num+ ", email= "+email);
	}
	
	public void start() {
		class Member{
			int num = 200;
			String name = "세종대왕";
			Member(){
				
			}
			Member(int num, String name){
				this.num =num;
				this.name = name;
				
			}
			
			void memberOutput() {
//				System.out.println("번호=" + num + ", 이름=" + name + ", email=" + email + "num = " + getNum());
			}
		}
		Member mem = new Member(9999, "김경진");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
