package Inheritance;
import java.util.Scanner;
public class AbstractTestMain extends AbstractTest {

	
	public AbstractTestMain() {
		
	}
	@Override
	public int minus(int c, int d) {
		int result = c-d;
		return result;
	}
	@Override
	public int divide(int a, int b) {
		double result = a/(double)b;
		return (int)result;
	}
	
	public int multiple(int a, int b) {
		return a * b;
	}
	public void infomation() {
		System.out.println("grade= " + grade);
	}
	
	public static void main(String[] args) {
		AbstractTestMain atm = new AbstractTestMain();

		System.out.println("합= "+ atm.add(10, 20));
		System.out.println("차= "+ atm.minus(100, 50));
		System.out.println("곱= "+ atm.multiple(5, 3));
		System.out.println("나누기= "+ atm.divide(20, 2));
		atm.infomation();
		
		
		double name = 24.13;
		System.out.println(name);

	}

}
