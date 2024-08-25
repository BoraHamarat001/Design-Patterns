package operatingsystems.abstractfactoryP;

public class Linux implements OS {
	public Linux() {}
	@Override
	public void message() {
	   System.out.println("This is a Linux machine. It must be combined with a Linux distribution");
	}

}
