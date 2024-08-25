package HomeAutomation.commandP;

public class PowerCommand implements Command {
	Light light;
	public PowerCommand(Light light) {
		this.light=light;
	}
	@Override
	public void execute() {
		this.light.on();
	}
	@Override
	public void unexecute() {
		this.light.off();
	}
	
}
