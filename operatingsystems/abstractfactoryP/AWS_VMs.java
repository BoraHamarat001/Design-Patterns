package operatingsystems.abstractfactoryP;

public class AWS_VMs {
	MachineFactory factory;
    public AWS_VMs(MachineFactory factory) {
    	this.factory=factory;
    }
    public void rentVM(String machine_type) {
    	OS operating_system;
    	Distribution dist;
    	operating_system=this.factory.getOS();
    	dist=this.factory.getDist(machine_type);
    	System.out.println("Amazon Web Services provides...");
    	operating_system.message();
    	dist.combineMessage();
    }

}
