package operatingsystems.abstractfactoryP;

public class MacOSMachineFactory implements MachineFactory {
	@Override
	public OS getOS() {
		return new MacOS();
	}
	@Override
	public Distribution getDist(String type) {
		if(type.equals("macos11")) {
			return new MacOS11();
		}
		else if(type.equals("macos14")) {
			return new MacOS14();
		}
		else {
			System.out.println("Not a valid value or macOS dist!");
			return null;
		}
	}

}
