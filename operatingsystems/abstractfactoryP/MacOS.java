package operatingsystems.abstractfactoryP;

public class MacOS implements OS {
	public MacOS() {}
	@Override
	public void message() {
	   System.out.println("This is a MacOS machine. It must be combined with a MacOS distribution");
	}

}
