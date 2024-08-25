package operatingsystems.abstractfactoryP;

public class RedHat implements Distribution{
	public RedHat() {}
	@Override
	public void combineMessage() {
		System.out.println("RedHat is a Linux distribution");
	}

}
