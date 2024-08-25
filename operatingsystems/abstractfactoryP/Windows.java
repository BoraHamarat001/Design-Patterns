package operatingsystems.abstractfactoryP;

public class Windows implements OS {
	public Windows() {}
	@Override
	public void message() {
		System.out.println("This is a Windows machine. It must be combined with a Windows distribution");
	}

}
