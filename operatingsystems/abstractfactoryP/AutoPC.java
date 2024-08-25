package operatingsystems.abstractfactoryP;

public class AutoPC implements Distribution {
	public AutoPC() {}
	@Override
	public void combineMessage() {
		System.out.println("AutoPC is a Windows distribution");
	}

}
