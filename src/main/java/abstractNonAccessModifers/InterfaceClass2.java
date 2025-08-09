package abstractNonAccessModifers;

public class InterfaceClass2 implements InterfaceClass1,InterfaceClass0{

	public static void main(String[] args) {
//		InterfaceClass1 obj = new InterfaceClass1();
		InterfaceClass1.navigateToFundTransfer();
		InterfaceClass2 obj = new InterfaceClass2();
		obj.enableGPT();
	}

	@Override
	public void launchApplication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterText() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeApplication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateToFundTransfer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sumOfNumbers(int a, int b) {
		int c= a+b;
		return c;
	}
	

	


}
