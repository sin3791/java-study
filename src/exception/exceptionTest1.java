package exception;
import java.util.Scanner;
import java.util.InputMismatchException;
public class exceptionTest1 {

	Scanner sc = new Scanner(System.in);
	public exceptionTest1() {
		
	}
	
	public void getMessage() {
		System.out.println("정수만 입력해야합니다.");
	}
	
	public void start() {
		
		try {
			int data = 200;
			System.out.print("첫번째 정수 =");
			int first = sc.nextInt();
			
			
			System.out.print("두번째 정수 =");
			int second = sc.nextInt();
			
			int result = first/second;
			System.out.println("result = " + result);
			
			String name[] = {"홍길동", "김길동", "박길동"};
			for(int i = 0; i < name.length; i++) {
				System.out.println("이름=" +name[i]);
				System.out.println(name.length);
			}
		} catch (ArithmeticException ea) {
			System.out.println(ea.getMessage());
            System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
			System.out.println("배열의 Index가 잘못되었습니다.");
		} finally {
			sc.close();
			System.out.println("무조건 실행된다. 프로그램을 종료합니다.");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exceptionTest1 ex = new exceptionTest1();
		ex.start();
	}

}
