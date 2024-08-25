package operatingsystems.abstractfactoryP;

public interface MachineFactory {
	public OS getOS();
	public Distribution getDist(String type);
}
