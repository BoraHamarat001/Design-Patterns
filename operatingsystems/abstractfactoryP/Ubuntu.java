package operatingsystems.abstractfactoryP;

public class Ubuntu implements Distribution {
	public Ubuntu() {}
	@Override
	public void combineMessage() {
		System.out.println("Ubuntu is a Linux distribution");
	}
}
