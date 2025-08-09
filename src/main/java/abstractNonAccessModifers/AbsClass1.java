package abstractNonAccessModifers;

public abstract class AbsClass1 {
	
	public abstract void launchApplication();
	
	public abstract void click();
	
	public abstract void enterText();
	
	public abstract void closeApplication();
	
	public void commonMethod() {
		System.out.println("This is a common method in the abstract class.");
	}

}
