package operatingsystems.abstractfactoryP;

public class WindowsXP implements Distribution{
	public WindowsXP() {}
	@Override
	public void combineMessage() {
		System.out.println("Windows XP is a Windows distribution");
	}


}
