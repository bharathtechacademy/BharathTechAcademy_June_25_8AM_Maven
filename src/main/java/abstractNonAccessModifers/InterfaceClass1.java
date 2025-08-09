package abstractNonAccessModifers;

public interface InterfaceClass1 {

	public abstract void launchApplication();

	public abstract void click();

	public abstract void enterText();

	public abstract void closeApplication();

	public void commonMethod();
	
	default void enableGPT() {
		//Not applicable for this interface
		navigateToFundTransferDefault();
	}
	
	static void navigateToFundTransfer() {
		System.out.println("Navigating to Fund Transfer");
	}
	
	private void navigateToFundTransferDefault() {
		System.out.println("Navigating to Fund Transfer using default method");
	}
	
	public int sumOfNumbers(int a, int b);

}
