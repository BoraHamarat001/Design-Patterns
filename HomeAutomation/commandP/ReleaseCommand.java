package HomeAutomation.commandP;

public class ReleaseCommand implements CalculatorCommand {
	Screen_Number screenNumber;
	public  ReleaseCommand(Screen_Number screenNumber) {
		this.screenNumber=screenNumber;
	}
	@Override
	public void execute() {
		this.screenNumber.off();
	}
	@Override
    public void undo() {
	    this.screenNumber.on();
	}
	public int getValue() {
		return this.screenNumber.getValue();
	}

}
