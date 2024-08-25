package HomeAutomation.commandP;

public class LightColorCommand implements Command {
	Light light;
	public LightColorCommand(Light light) {
		this.light=light;
	}
	@Override
	public void execute() {
		this.light.setColor("Yellow");
	}
	@Override
	public void unexecute() {
		this.light.setColor("White");
	}

}
