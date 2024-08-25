package HomeAutomation.commandP;

public class BrightnessLevelCommand implements Command {
	Light light;
	public BrightnessLevelCommand(Light light) {
		this.light=light;
	}
	@Override
	public void execute() {
		this.light.upBrightnessLevel();
	}
	@Override
	public void unexecute() {
		this.light.downBrightnessLevel();
	}
	

}
