package api;

public class WrapperTest {

	
	public WrapperTest() {
		int num =1234;
		
//		Integer numObj = new Integer(num);
		Integer numObj = Integer.valueOf(num);
		
		String data = "12500";
//		Integer dataInt = new Integer(data);
		Integer dataInt = Integer.valueOf(data);
		System.out.println(dataInt + 10);
		
		
		
		Integer numObj2 = num;
		int data2 = dataInt;
		Object o1 = data2;
		
		Object o2 = numObj2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WrapperTest();
	}

}
