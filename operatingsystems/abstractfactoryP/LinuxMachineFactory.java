package operatingsystems.abstractfactoryP;

public class LinuxMachineFactory implements MachineFactory {
	@Override
	public OS getOS() {
		return new Linux();
	}
	@Override
	public Distribution getDist(String type) {
		if(type.equals("ubuntu")) {
			return new Ubuntu();
		}
		else if(type.equals("redhat")) {
			return new RedHat();
		}
		else {
			System.out.println("Not a valid value or linux dist!");
			return null;
		}	
	}
 
}
