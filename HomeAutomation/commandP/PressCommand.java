package HomeAutomation.commandP;

public class PressCommand implements CalculatorCommand {
	Screen_Number screenNumber;
	public PressCommand(Screen_Number screen_Number) {
		this.screenNumber=screen_Number;
	}
	@Override
	public void execute() {
		this.screenNumber.on();
	}
	 @Override
	public void undo() {
		 this.screenNumber.off();
	}
	public int getValue() {
		return this.screenNumber.getValue();
	}
	
}
