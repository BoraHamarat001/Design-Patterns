package operatingsystems.abstractfactoryP;

public class WindowsMachineFactory implements MachineFactory {
	@Override
	public OS getOS() {
		return new Windows();
	}
	@Override
	public Distribution getDist(String type) {
		if(type.equals("windowsxp")) {
			return new WindowsXP();
		}
		else if(type.equals("autopc")) {
			return new AutoPC();
		}
		else {
			System.out.println("Not a valid value or windows dist!");
			return null;
		}
	}

}
