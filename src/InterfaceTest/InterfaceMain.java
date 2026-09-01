package InterfaceTest;

public class InterfaceMain implements InterfaceA {
	
	public static void main(String[] args) {
		InterfaceMain in = new InterfaceMain();
		int r = in.add(1000, 2000);
		System.out.println("r=" + r);
		
		System.out.println("Max=" + InterfaceA.Max);
		
		System.out.println("sqrt=" + in.pow(5, 3));
		
		InterfaceA in2 = new InterfaceMain();
		System.out.println("divide=" + in2.divide(10, 3));
		
		
		InterfaceMain in3 = (InterfaceMain)in2;
		System.out.println("int3.add()="+ in3.add(300, 45));
//		System.out.println("int3.add()="+ in3.multiple(5, 120));
		System.out.println("int3.pow()="+ in3.pow(5, 120));

	}

	@Override
	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public double pow(double data, int p) {
		double result = 1.0;
		for (int i = 1; i <= p; i++) {
			result *= result * data;
		}
		
		return result;
	}
	
	
}
