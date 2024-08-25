package HomeAutomation.commandP;

public interface CalculatorCommand {
	public void execute();
	public void undo();
	public int getValue();
}
