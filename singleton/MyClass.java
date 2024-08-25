package singleton;

public class MyClass {
	private static MyClass uniqueInstance;
	public String value;
	private MyClass(String value) {
		try {
			Thread.sleep(1000);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		this.value=value;
		
	}
	public static MyClass getInstance(String value) {
		if(uniqueInstance==null) {
			uniqueInstance=new MyClass(value);
		}
		else {
			System.out.println("Already has instantiated!!");
		}
		return uniqueInstance;
	}
	public void resetInstance() {
		uniqueInstance=null;
	}
}
